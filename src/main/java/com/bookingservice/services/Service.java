package com.bookingservice.services;

import com.bookingservice.models.Booking;
import com.bookingservice.models.User;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Service<T> {
    //CRUD

    //create
    boolean create(Class<T> clazz, List<Object> params) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;

    //readAll/getAll
    List<T> getAll();

    //getById
    T getById(Integer id);

    //getByParam
    T getByParam(String method, String param);

    //get by User
    List<T> getByUser(User user);

    //update
    T update(T obj, List<Object> params);

    //delete
    boolean delete(T obj);

}
