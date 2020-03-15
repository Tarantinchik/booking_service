package com.bookingservice.controllers;

import com.bookingservice.models.User;
import com.bookingservice.services.UserServiceImpl;

import java.util.List;

public class UserControllerImpl implements UserController {

    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    public boolean addUser(User user) {
        return this.userService.addUser(user);
    }

    @Override
    public User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        return this.userService.createUser(login, password, firstName, lastName, phone, email, age, countryResidence);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return this.userService.getUserById(id);
    }

    @Override
    public User getUserByLogin(String login) {
        return this.userService.getUserByLogin(login);
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        return this.userService.getUserByLoginAndPassword(login, password);
    }

    @Override
    public List<User> getUserByParams(List<String> params) {
        return this.userService.getUserByParams(params);
    }

    @Override
    public User updateUser(List<String> data) {
        return this.userService.updateUser(data);
    }

    @Override
    public boolean deleteUser(User booking) {
        return this.userService.deleteUser(booking);
    }
}
