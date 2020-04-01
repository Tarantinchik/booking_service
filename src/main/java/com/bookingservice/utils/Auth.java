package com.bookingservice.utils;

import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.models.User;

public class Auth {

    private User user;
    private UserControllerImpl userController;

    public Auth(User user, UserControllerImpl userController) {
        this.user = user;
        this.userController = userController;
    }

    public User getUser() {
        return user;
    }

    public void logIn(String login, String password) {
        this.user.setToken(String.valueOf(this.user.hashCode()));
    }

    public void logOut() {
        this.user.setToken("");
    }

    public boolean registration(int id, String login, String password, String firstName, String lastName, String phone, String email, Integer age, String countryResidence) {
        User user = this.userController.createUser(id, login, password, firstName, lastName, phone, email, age, countryResidence);
        return this.userController.addUser(user);
    }

}