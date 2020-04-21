package com.bookingservice.db;

import com.bookingservice.utils.PropertiesReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private PropertiesReader pr = new PropertiesReader();
    private Connection connection;

    public Connection getDBConnection() {
        try {
            Class.forName(pr.getDriverClass());
            connection = DriverManager.getConnection(pr.getUrl(), pr.getUser(), pr.getPassword());
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Get DB connection: Something was wrong!");
        }
        return null;
    }

}