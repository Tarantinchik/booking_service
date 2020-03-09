package com.bookingservice.dao;

import com.bookingservice.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return this.userList;
    }

    public boolean add(User obj) {
        return this.userList.add(obj);
    }

    public boolean delete(User obj) {
        return this.userList.remove(obj);
    }

}