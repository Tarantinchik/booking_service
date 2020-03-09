package com.bookingservice.services;

import com.bookingservice.dao.UserDAO;
import com.bookingservice.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();


    @Override
    public User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        return new User(login, password, firstName, lastName, phone, email, age, countryResidence);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        return null;
    }

    @Override
    public List<User> getUserByParams(List<String> params) {
        return null;
    }

    @Override
    public User updateUser(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteUser(User booking) {
        return false;
    }
}