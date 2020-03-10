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

    private final String filePath;
    private final UserControllerImpl userController = new UserControllerImpl();
    private final FlightControllerImpl flightController = new FlightControllerImpl();
    private final BookingControllerImpl bookingController = new BookingControllerImpl();

    public FileReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean addUsers() {
        try(Stream<String> stream = Files.lines(Paths.get(this.filePath))) {
            stream.forEach(e -> {
                String[] paramsStr = e.split(" ");
                List<String> paramsList = Arrays.asList(paramsStr);
                User user = this.userController.createUser(
                        paramsList.get(0),
                        paramsList.get(1),
                        paramsList.get(2),
                        paramsList.get(3),
                        paramsList.get(4),
                        paramsList.get(5),
                        Integer.parseInt(paramsList.get(6)),
                        paramsList.get(7)

                );
                this.userController.addUser(user);
            });
        } catch (IOException e) {
            System.out.println("Error file read!");
            return false;
        }
        return true;
    }

    @Override
    public boolean addFlights() {
        try(Stream<String> stream = Files.lines(Paths.get(this.filePath))) {
            stream.forEach(e -> {
                String[] paramsStr = e.split(" ");
                List<String> paramsList = Arrays.asList(paramsStr);
                Flight flight = this.flightController.createFlight(
                        Integer.parseInt(paramsList.get(0)),
                        paramsList.get(1),
                        paramsList.get(2),
                        LocalDate.parse(paramsList.get(3)),
                        LocalDate.parse(paramsList.get(4)),
                        Double.parseDouble(paramsList.get(5))

                );
                this.flightController.addFlight(flight);
            });
        } catch (IOException e) {
            System.out.println("Error file read!");
            return false;
        }
        return true;
    }

    @Override
    public boolean addBookings() {
        return true;
    }

}