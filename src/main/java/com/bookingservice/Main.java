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
//        UserControllerImpl userController = new UserControllerImpl();
//        userController.createUser("Murka", "1234567", "Saha", "Gulieva", "34567843", "saha@test.com", 34, "Uzbekistan");
//        userController.createUser("Kapitoshka", "1234567", "Dasha", "Gromova", "345645327", "iza@test.com", 24, "Belorussia");
//        userController.createUser("Doctor", "1234567", "Kirill", "Ivanov", "345645324", "kira@test.com", 29, "Bulgaria");
//        userController.createUser("Hirurg", "1234567", "Igor", "Britskiy", "345645321", "igor@test.com", 39, "Ukraine");
//        userController.createUser("Umnik", "1234567", "Alex", "Shvartc", "345645329", "alex@gmail.com", 49, "USA");
//
//        FlightControllerImpl flightController = new FlightControllerImpl();
//        flightController.createFlight(200, "Kiev", "Madrid", LocalDate.parse("2020-03-08"), LocalDate.parse("2020-03-08"), 140.00);
//        flightController.createFlight(250, "Kiev", "Lisbon", LocalDate.parse("2020-03-10"), LocalDate.parse("2020-03-15"), 165.00);
//        flightController.createFlight(300, "Kiev", "Praha", LocalDate.parse("2020-03-11"), LocalDate.parse("2020-03-16"), 130.00);
//        flightController.createFlight(150, "Kiev", "Berlin", LocalDate.parse("2020-03-12"), LocalDate.parse("2020-03-17"), 145.00);
//        flightController.createFlight(250, "Kiev", "New York", LocalDate.parse("2020-03-14"), LocalDate.parse("2020-03-20"), 300.00);
//
//        BookingControllerImpl bookingController = new BookingControllerImpl();
//        bookingController.createBooking(1, flightController.getAllFlights().get(0), userController.getAllUsers().get(0));
//        bookingController.createBooking(2, flightController.getAllFlights().get(1), userController.getAllUsers().get(1));
//        bookingController.createBooking(1, flightController.getAllFlights().get(2), userController.getAllUsers().get(2));
//        bookingController.createBooking(2, flightController.getAllFlights().get(3), userController.getAllUsers().get(3));
//        bookingController.createBooking(3, flightController.getAllFlights().get(4), userController.getAllUsers().get(4));

       /* ----------------------------------------------------------------------------------------------------------- */

//        Auth auth = new Auth(new User());
//
//        auth.setUser(userController.getById(0));
//
//        while(true) {
//            if (!auth.getUser().getToken().equals("") && auth.getUser().getToken().equals(String.valueOf(auth.getUser().hashCode()))) {
//                List<Booking> userBookingList = bookingController.getByUser(auth.getUser());
//                userBookingList.forEach(System.out::println);
//
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                flightController.getAll().forEach(System.out::println);
//            } else {
//                flightController.getAll().forEach(System.out::println);
//            }
//            System.out.println();
//        }

    }

}