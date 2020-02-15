package com.bookingservice.services;

import com.bookingservice.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<User> getUsersById(Integer id) {
        return null;
    }

    @Override
    public List<User> getUsersByLogin(String login) {
        return null;
    }

    @Override
    public User updateUser(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}
