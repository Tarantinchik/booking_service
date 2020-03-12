package com.bookingservice;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.models.User;
import com.bookingservice.utils.FileReaderImpl;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserControllerImpl userController = new UserControllerImpl();
        BookingControllerImpl bookingController = new BookingControllerImpl();
        FlightControllerImpl flightController = new FlightControllerImpl();

        FileReaderImpl fileReader = new FileReaderImpl();
        boolean isUsersAdded = fileReader.addUsers("src/main/data/users.txt", userController);
        boolean isFlightsAdded = fileReader.addFlights("src/main/data/flights.txt", flightController);
        boolean isBookingsAdded = fileReader.addBookings("src/main/data/bookings.txt", bookingController, flightController, userController);

        System.out.println(isUsersAdded);

        userController.getAllUsers().forEach(System.out::println);
        System.out.println();
        flightController.getAllFlights().forEach(System.out::println);
        System.out.println();
        bookingController.getAllBookings().forEach(System.out::println);
    }

}