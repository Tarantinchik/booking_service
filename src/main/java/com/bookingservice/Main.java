package com.bookingservice;

import com.bookingservice.controllers.ControllerImpl;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        ControllerImpl<User> userController = new ControllerImpl<>();
        userController.create(User.class, Arrays.asList(
                "Murka", "1234567", "Saha", "Gulieva", "34567843", "saha@test.com", 34, "Uzbekistan"
        ));
        userController.create(User.class, Arrays.asList(
                "Kapitoshka", "1234567", "Dasha", "Gromova", "345645327", "iza@test.com", 24, "Belorussia"
        ));
        userController.create(User.class, Arrays.asList(
                "Doctor", "1234567", "Kirill", "Ivanov", "345645324", "kira@test.com", 29, "Bulgaria"
        ));
        userController.create(User.class, Arrays.asList(
                "Hirurg", "1234567", "Igor", "Britskiy", "345645321", "igor@test.com", 39, "Ukraine"
        ));
        userController.create(User.class, Arrays.asList(
                "Umnik", "1234567", "Alex", "Shvartc", "345645329", "alex@gmail.com", 49, "USA"
        ));

        ControllerImpl<Flight> flightController = new ControllerImpl<>();
        flightController.create(Flight.class, Arrays.asList(
                200, "Kiev", "Madrid", "2020-03-08", "2020-03-08", 140.00
        ));
        flightController.create(Flight.class, Arrays.asList(
                250, "Kiev", "Lisbon", "2020-03-10", "2020-03-15", 165.00
        ));
        flightController.create(Flight.class, Arrays.asList(
                300, "Kiev", "Praha", "2020-03-11", "2020-03-16", 130.00
        ));
        flightController.create(Flight.class, Arrays.asList(
                150, "Kiev", "Berlin", "2020-03-12", "2020-03-17", 145.00
        ));
        flightController.create(Flight.class, Arrays.asList(
                250, "Kiev", "New York", "2020-03-14", "2020-03-20", 300.00
        ));

        ControllerImpl<Booking> bookingController = new ControllerImpl<>();
        bookingController.create(Booking.class, Arrays.asList(
                1, flightController.getAll().get(0), userController.getAll().get(0)
        ));
        bookingController.create(Booking.class, Arrays.asList(
                2, flightController.getAll().get(1), userController.getAll().get(1)
        ));
        bookingController.create(Booking.class, Arrays.asList(
                4, flightController.getAll().get(2), userController.getAll().get(2)
        ));
        bookingController.create(Booking.class, Arrays.asList(
                10, flightController.getAll().get(3), userController.getAll().get(3)
        ));
        bookingController.create(Booking.class, Arrays.asList(
                1, flightController.getAll().get(4), userController.getAll().get(4)
        ));

        userController.update(
                User.class,
                userController.getById(User.class, 0),
                Arrays.asList(25, "USA", "gadina@test.com", "300000000"));

    }

}