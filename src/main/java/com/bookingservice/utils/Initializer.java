package com.bookingservice.utils;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.db.DBService;

import java.sql.Connection;
import java.sql.SQLException;

public class Initializer {

    private final Connection connection;
    private final UserControllerImpl userController;
    private final FlightControllerImpl flightController;
    private final BookingControllerImpl bookingController;

    public Initializer(Connection connection, UserControllerImpl userController, FlightControllerImpl flightController, BookingControllerImpl bookingController) {
        this.connection = connection;
        this.userController = userController;
        this.flightController = flightController;
        this.bookingController = bookingController;
    }


    public void initialize() throws SQLException {
        DBService worker = new DBService(connection, userController, flightController, bookingController);
        worker.getUsersFromDB();
        worker.getFlightsFromDB();
        worker.getBookingsFromDB();
    }

}
