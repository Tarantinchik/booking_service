package com.bookingservice.utils;

import java.util.ResourceBundle;

public class PropertiesReader {

    private ResourceBundle db = ResourceBundle.getBundle("db");

    public String getUrl() {
        return this.db.getString("url");
    }

    public String getUser() {
        return this.db.getString("username");
    }

    public String getPassword() {
        return this.db.getString("password");
    }

    public String getDriverClass() {
        return this.db.getString("driver_class");
    }
}
