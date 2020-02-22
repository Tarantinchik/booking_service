package com.bookingservice.services;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.util.List;

public interface BookingService {

    //CRUD

    //create
    Booking createBooking(int seatsBooked, Flight flight, User user);

    //read All bookings
    List<Booking> getAllBooking();

    //read booking by id
    Booking getBookingById(Integer id);

    //read booking by Booking id
    Booking getBookingByBookingId(String bookingId);

    //read booking by user
    Booking getBookingByUser(User user);

    //update booking
    Booking updateBooking(List<String> data);

    //delete booking
    boolean deleteBooking(Booking booking);

}
