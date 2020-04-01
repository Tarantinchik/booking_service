package com.bookingservice;

import com.bookingservice.db.DBConnector;
import com.bookingservice.db.DBWorker;
import com.bookingservice.models.User;
import com.bookingservice.view.ConsoleView;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        //new ConsoleView().run();
        DBConnector connector = new DBConnector();
        DBWorker worker = new DBWorker(connector.getDBConnection());
        List<User> usersFromDB = worker.getUsersFromDB();
        usersFromDB.forEach(System.out::println);

    }

}