package com.bookingservice;

import com.bookingservice.view.ConsoleView;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        new ConsoleView().run();

    }

}