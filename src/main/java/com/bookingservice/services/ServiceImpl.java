package com.bookingservice.services;

import com.bookingservice.dao.ObjectDAO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ServiceImpl<T> implements Service<T> {

    private ObjectDAO<T> objectDAO = new ObjectDAO<>();

    @Override
    public boolean create(Class<T> clazz, List<Object> params) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return this.objectDAO.getObjList().add(clazz.getConstructor(List.class).newInstance(params));
    }

    @Override
    public List<T> getAll() {
        return this.objectDAO.getObjList();
    }

    @Override
    public T getById(Class<T> clazz, Integer id) {
        return this.objectDAO.getObjList()
                .stream()
                .filter(e -> {
                    try {
                        return id.equals(e.getClass().getMethod("getId").invoke(e));
                    } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                        System.out.println("Something went wrong!");
                    }
                    return false;
                })
                .findFirst()
                .orElse(null);
    }

    @Override
    public T getByParam(Class<T> clazz, String method, String param) {
        return this.objectDAO.getObjList()
                .stream()
                .filter(e -> {
                    try {
                        return param.equals(e.getClass().getMethod(method).invoke(e));
                    } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                        System.out.println("Method not found!");
                    }
                    return false;
                })
                .findFirst()
                .orElse(null);
    }

    @Override
    public T update(List<Object> params) {
        return null;
    }

    @Override
    public boolean delete(T obj) {
        return this.objectDAO.delete(obj);
    }
}
