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

        //TODO
        //Добавить в файл flights.txt 25 новых рейсов

        FileReaderImpl fileReader = new FileReaderImpl();
        boolean isUsersAdded = fileReader.addUsers("data/users.txt", userController);
        boolean isFlightsAdded = fileReader.addFlights("data/flights.txt", flightController);
        boolean isBookingsAdded = fileReader.addBookings("data/bookings.txt", bookingController, flightController, userController);

        System.out.println(isUsersAdded);
        System.out.println(isFlightsAdded);
        System.out.println(isBookingsAdded);

        userController.getAllUsers().forEach(System.out::println);
        System.out.println();
        flightController.getAllFlights().forEach(System.out::println);
        System.out.println();
        bookingController.getAllBookings().forEach(System.out::println);
    }

}