package com.bookingservice.utils;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.db.DBConnector;
import com.bookingservice.db.DBWorker;

import java.sql.SQLException;

public class Initializer {

    private final UserControllerImpl userController;
    private final FlightControllerImpl flightController;
    private final BookingControllerImpl bookingController;

    public Initializer(UserControllerImpl userController, FlightControllerImpl flightController, BookingControllerImpl bookingController) {
        this.userController = userController;
        this.flightController = flightController;
        this.bookingController = bookingController;
    }

    public boolean initialize() throws SQLException {

        DBConnector connector = new DBConnector();
        DBWorker worker = new DBWorker(connector.getDBConnection(), userController, flightController, bookingController);
        worker.getUsersFromDB();
        worker.getFlightsFromDB();
        worker.getBookingsFromDB();
        return true;
    }

}
