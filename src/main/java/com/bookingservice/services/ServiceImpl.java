package com.bookingservice.services;

import com.bookingservice.dao.ObjectDAO;
import com.bookingservice.models.Booking;
import com.bookingservice.models.User;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
    public T getById(Integer id) {
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
    public T getByParam(String method, String param) {
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
    public List<T> getByUser(User user) {
        return this.objectDAO.getObjList()
                .stream()
                .filter(booking -> {
                    try {
                        return user.equals(Booking.class.getMethod("getUser").invoke(booking));
                    } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                        System.out.println("Method not found!");
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    @Override
    public T update(T obj, List<Object> params) throws SecurityException {
        List<String> setters = Arrays.stream(obj.getClass().getMethods())
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1 && !"setToken".equals(method.getName()))
                .map(Method::getName)
                .sorted()
                .collect(toList());

        Map<String, Object> dataMap = new HashMap<>();

        for (int i = 0; i < setters.size(); i++) {
            dataMap.put(setters.get(i), params.get(i));
        }

        dataMap.forEach((method, param) -> {
            try {
                obj.getClass().getMethod(method, param.getClass()).invoke(obj, param);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
                System.out.println("Something went wrong!");
            }
        });
        return obj;
    }

    @Override
    public boolean delete(T obj) {
        return this.objectDAO.delete(obj);
    }
}
