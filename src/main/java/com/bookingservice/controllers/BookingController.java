package com.bookingservice.controllers;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.util.List;

public interface BookingController {

    //CRUD

    //create
    Booking createBooking(int seatsBooked, Flight flight, User user);

    //readAll
    List<Booking> getAllBookings();

    //readById
    Booking getBookingById(Integer id);

    //readByUser
    Booking getBookingByUser(User user);

    //update
    Booking updateBooking(List<String> data);

    //delete
    boolean deleteBooking(Booking booking);

}
