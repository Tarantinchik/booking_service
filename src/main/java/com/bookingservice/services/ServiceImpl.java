package com.bookingservice.services;

import com.bookingservice.dao.ObjectDAO;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public T update(Class<T> clazz, T obj, List<Object> params) throws SecurityException {
        List<String> setters = Arrays.stream(clazz.getMethods())
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1 && !"setToken".equals(method.getName()))
                .map(Method::getName)
                .sorted()
                .collect(Collectors.toList());

        Map<String, Object> dataMap = new HashMap<>();

        for (int i = 0; i < setters.size(); i++) {
            dataMap.put(setters.get(i), params.get(i));
        }

        try {
            obj.getClass().getMethod("setAge", Integer.class).invoke(obj, 25);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println(obj);

        try {
            PropertyDescriptor pd = new PropertyDescriptor("age", clazz);
            pd.getWriteMethod().invoke(obj, 25);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        dataMap.forEach((method, param) -> {
            System.out.println(method + " -> " + param);
            try {
                clazz.getDeclaredMethod(method, Integer.class).invoke(obj, 25);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
                ex.printStackTrace();
            }
        });

        return obj;
    }

    @Override
    public boolean delete(T obj) {
        return this.objectDAO.delete(obj);
    }
}
