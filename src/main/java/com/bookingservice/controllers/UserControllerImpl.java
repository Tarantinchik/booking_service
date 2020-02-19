package com.bookingservice.controllers;

import com.bookingservice.models.User;
import com.bookingservice.services.UserServiceImpl;

import java.util.List;

public class UserControllerImpl implements UserController {

    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    public User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        return this.userService.createUser(login, password, firstName, lastName, phone, email, age, countryResidence);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @Override
    public User getUsersById(Integer id) {
        return this.userService.getUsersById(id);
    }

    @Override
    public User getUsersByLogin(String login) {
        return this.userService.getUsersByLogin(login);
    }

    @Override
    public User updateUser(List<String> data) {
        return this.userService.updateUser(data);
    }

    @Override
    public boolean deleteUser(User user) {
        return this.userService.deleteUser(user);
    }
}
