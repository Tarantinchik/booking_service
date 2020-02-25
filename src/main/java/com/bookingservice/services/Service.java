package com.bookingservice.services;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Service<T> {
    //CRUD

    //create
    boolean create(Class<T> clazz, List<Object> params) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;

    //readAll/getAll
    List<T> getAll();

    //getById
    T getById(Class<T> clazz, Integer id);

    //getByParam
    T getByParam(Class<T> clazz, String method, String param);

    //update
    T update(List<Object> params);

    //delete
    boolean delete(T obj);

}
