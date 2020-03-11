package com.bookingservice.utils;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;

public interface FileReader {

    boolean addUsers(String filePath, UserControllerImpl userController);

    boolean addFlights(String filePath, FlightControllerImpl flightController);

    boolean addBookings(String filePath, BookingControllerImpl bookingController, FlightControllerImpl flightController, UserControllerImpl userController);

}