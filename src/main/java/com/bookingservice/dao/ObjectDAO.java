package com.bookingservice.dao;

import java.util.ArrayList;
import java.util.List;

public class ObjectDAO<T> {

    private List<T> objList = new ArrayList<>();

    public List<T> getObjList() {
        return this.objList;
    }

    public boolean add(T obj) {
        return this.objList.add(obj);
    }

    public boolean delete(T obj) {
        return this.objList.remove(obj);
    }

}