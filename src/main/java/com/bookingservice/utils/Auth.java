package com.bookingservice.utils;

import com.bookingservice.models.User;

public class Auth {

    private User user;

    public Auth(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        this.user.setToken(String.valueOf(this.user.hashCode()));
    }
}