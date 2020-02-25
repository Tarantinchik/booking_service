package com.bookingservice.services;

import com.bookingservice.dao.ObjectDAO;

import java.lang.reflect.Constructor;
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
    public T update(List<Object> params) {
        return null;
    }

    @Override
    public boolean delete(T obj) {
        return this.objectDAO.delete(obj);
    }
}
