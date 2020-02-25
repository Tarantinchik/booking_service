package com.bookingservice.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Controller<T> {
    //CRUD

    //create
    boolean create(Class<T> clazz, List<Object> params) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;

    //readAll/getAll
    List<T> getAll();

    //update
    T update(List<Object> params);

    //delete
    boolean delete(T obj);

}