package com.bookingservice.services;

import com.bookingservice.dao.UserDAO;
import com.bookingservice.db.DBService;
import com.bookingservice.models.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();
    private final DBService dbService = new DBService();

    @Override
    public boolean addUser(User user) {
        return this.userDAO.addUser(user);
    }

    @Override
    public User createUser(int id, String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        return new User(id, login, password, firstName, lastName, phone, email, age, countryResidence);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDAO.getUserList();
    }

    @Override
    public User getUserById(Integer id) {
        return this.userDAO.getUserList()
                .stream()
                .filter(user -> id.equals(user.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User getUserByLogin(String login) {
        return this.userDAO.getUserList()
                .stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        return this.userDAO.getUserList()
                .stream()
                .filter(user -> login.equals(user.getLogin()) && password.equals(user.getPassword()))
                .findFirst()
                .orElse(null);
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
    public boolean deleteUser(User user) {
        return this.userDAO.deleteUser(user);
    }

    public List<Object> getUserDataByID(int id) throws SQLException {
        if (id < 0 || id > 9999) {
            return null;
        }
        return this.dbService.getUserDataByID(id);
    }
}