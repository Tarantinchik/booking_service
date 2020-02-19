package com.bookingservice.controllers;

import com.bookingservice.models.User;

import java.util.List;

public interface UserController {

    // CRUD

    //create
    User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence);

    //read All users
    List<User> getAllUsers();

    //read user by id
    User getUsersById(Integer id);

    //read user by login
    User getUsersByLogin(String login);

    //update
    User updateUser(List<String> data);

    //delete
    boolean deleteUser(User user);

}
