package com.bookingservice.dao;

import com.bookingservice.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return this.userList;
    }

    public boolean addUser(User user) {
        return this.userList.add(user);
    }

    public boolean deleteUser(User user) {
        return this.userList.remove(user);
    }

}