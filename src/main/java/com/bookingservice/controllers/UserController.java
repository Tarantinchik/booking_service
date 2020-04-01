package com.bookingservice.controllers;

import com.bookingservice.models.User;

import java.util.List;

public interface UserController {

    //CRUD

    //add
    boolean addUser(User user);

    //create
    User createUser(int id, String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence);

    //readAll
    List<User> getAllUsers();

    //readById
    User getUserById(Integer id);

    //readByLogin
    User getUserByLogin(String login);

    //readByLoginAndPassword
    User getUserByLoginAndPassword(String login, String password);

    //readByParams
    List<User> getUserByParams(List<String> params);

    //update
    User updateUser(List<String> data);

    //delete
    boolean deleteUser(User booking);

}