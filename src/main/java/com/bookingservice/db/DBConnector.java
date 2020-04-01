package com.bookingservice.db;

import com.bookingservice.utils.PropertiesReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private PropertiesReader pr = new PropertiesReader();

    public Connection getDBConnection() {
        try {
            Class.forName(pr.getDriverClass());
            return DriverManager.getConnection(pr.getUrl(), pr.getUser(), pr.getPassword());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
