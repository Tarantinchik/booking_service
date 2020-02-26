package com.bookingservice.services;

import com.bookingservice.models.User;

import java.util.List;

public class UserServiceImpl extends ServiceImpl<User> {

//    private UserDAO userDAO = new UserDAO();
//
//    @Override
//    public User createUser(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
//        return null;//new User(login, password, firstName, lastName, phone, email, age, countryResidence);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return this.userDAO.getUserList();
//    }
//
//    @Override
//    public User getUsersById(Integer id) {
//        return this.userDAO.getUserList()
//                .stream()
//                .filter(user -> id.equals(user.getId()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public User getUsersByLogin(String login) {
//        return this.userDAO.getUserList()
//                .stream()
//                .filter(user -> login.equals(user.getLogin()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public User updateUser(List<String> data) {
//        return null;
//    }
//
//    @Override
//    public boolean deleteUser(User user) {
//        return this.userDAO.deleteUser(user);
//    }
}
