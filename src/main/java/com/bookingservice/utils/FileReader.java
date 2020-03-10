package com.bookingservice.utils;

import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.util.List;

public interface FileReader {

    boolean addUsers();

    boolean addFlights();

    boolean addBookings();

}