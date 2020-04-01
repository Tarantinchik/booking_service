package com.bookingservice.db;

import com.bookingservice.dao.UserDAO;
import com.bookingservice.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBWorker {

    private final Connection connection;
    private UserDAO userDAO = new UserDAO();

    public DBWorker(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public List<User> getUsersFromDB() throws SQLException {
        List<User> userList = new ArrayList<>();
        String query = "SELECT * FROM users;";

        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            User user = new User(
                    resultSet.getInt("id"),
                    resultSet.getString("login"),
                    resultSet.getString("password"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("phone"),
                    resultSet.getString("email"),
                    resultSet.getInt("age"),
                    resultSet.getString("country_residence")
            );
            userList.add(user);
        }
        userDAO.getUserList().addAll(userList);
        return userList;
    }
}
