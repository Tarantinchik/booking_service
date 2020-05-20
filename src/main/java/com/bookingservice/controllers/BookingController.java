package com.bookingservice.controllers;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.sql.SQLException;
import java.util.List;

public interface BookingController {

    //CRUD

    //add
    boolean addBooking(Booking booking);

    //create
    boolean createBooking(int seatsBooked, int flightId, int userId) throws SQLException;

    //readAll
    List<Booking> getAllBookings();

    //readById
    Booking getBookingById(Integer id);

    //readByUser
    Booking getBookingByUser(User user);

    //update
    Booking updateBooking(List<String> data);

    //delete
    boolean deleteBooking(int bookingId) throws SQLException;

}
