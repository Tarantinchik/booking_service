package com.bookingservice.controllers;

import com.bookingservice.models.User;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ControllerImpl<T> implements Controller<T> {

    private ServiceImpl<T> service = new ServiceImpl<>();

    @Override
    public boolean create(Class<T> clazz, List<Object> params) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return this.service.create(clazz, params);
    }

    @Override
    public List<T> getAll() {
        return this.service.getAll();
    }

    @Override
    public T getById(Integer id) {
        return this.service.getById(id);
    }

    @Override
    public T getByParam(String method, String param) {
        return this.service.getByParam(method, param);
    }

    @Override
    public List<T> getByUser(User user) {
        return this.service.getByUser(user);
    }

    @Override
    public T update(T obj, List<Object> params) {
        return this.service.update(obj, params);
    }


    @Override
    public boolean delete(T obj) {
        return this.service.delete(obj);
    }
}