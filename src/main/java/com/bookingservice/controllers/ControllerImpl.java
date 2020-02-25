package com.bookingservice.controllers;

import com.bookingservice.services.ServiceImpl;

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
    public T getById(Class<T> clazz, Integer id) {
        return this.service.getById(clazz, id);
    }

    @Override
    public T update(List<Object> params) {
        return this.service.update(params);
    }

    @Override
    public boolean delete(T obj) {
        return this.service.delete(obj);
    }
}