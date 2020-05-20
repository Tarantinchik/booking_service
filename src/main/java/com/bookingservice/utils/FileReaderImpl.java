package com.bookingservice.utils;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileReaderImpl implements FileReader {

    @Override
    public boolean addUsers(String filePath, UserControllerImpl userController) {
//        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
//            stream.forEach(e -> {
//                String[] paramsStr = e.split(" ");
//                List<String> paramsList = Arrays.asList(paramsStr);
//                User user = userController.createUser(
//                        paramsList.get(0),
//                        paramsList.get(1),
//                        paramsList.get(2),
//                        paramsList.get(3),
//                        paramsList.get(4),
//                        paramsList.get(5),
//                        Integer.parseInt(paramsList.get(6)),
//                        paramsList.get(7)
//                );
//                userController.addUser(user);
//            });
//        } catch (IOException e) {
//            System.out.println("Error!");
//            return false;
//        }
        return true;
    }

    @Override
    public boolean addFlights(String filePath, FlightControllerImpl flightController) {
//        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
//            stream.forEach(e -> {
//                String[] paramsStr = e.split(" ");
//                List<String> paramsList = Arrays.asList(paramsStr);
//                Flight flight = flightController.createFlight(
//                        Integer.parseInt(paramsList.get(0)),
//                        paramsList.get(1),
//                        paramsList.get(2),
//                        LocalDate.parse(paramsList.get(3)),
//                        LocalDate.parse(paramsList.get(4)),
//                        Double.parseDouble(paramsList.get(5))
//
//                );
//                flightController.addFlight(flight);
//            });
//        } catch (IOException e) {
//            System.out.println("Error!");
//            return false;
//        }
        return true;
    }

    @Override
    public boolean addBookings(String filePath, BookingControllerImpl bookingController, FlightControllerImpl flightController, UserControllerImpl userController) {
//        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
//            stream.forEach(e -> {
//                String[] paramsStr = e.split(" ");
//                List<String> paramsList = Arrays.asList(paramsStr);
//                Booking booking = bookingController.createBooking(
//                        Integer.parseInt(paramsList.get(0)),
//                        flightController.getFlightById(Integer.parseInt(paramsList.get(1))),
//                        userController.getUserById(Integer.parseInt(paramsList.get(2)))
//                );
//                bookingController.addBooking(booking);
//            });
//        } catch (IOException e) {
//            System.out.println("Error!");
//            return false;
//        }
        return true;
    }



}