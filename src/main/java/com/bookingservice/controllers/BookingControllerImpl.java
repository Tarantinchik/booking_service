package com.bookingservice.controllers;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;
import com.bookingservice.services.BookingService;
import com.bookingservice.services.BookingServiceImpl;

import java.util.List;

public class BookingControllerImpl implements BookingController {

    private BookingService BookingServiceImpl = new BookingServiceImpl();

    @Override
    public Booking createBooking(int seatsBooked, Flight flight, User user) {
        return this.BookingServiceImpl.createBooking(seatsBooked, flight, user);
    }

    @Override
    public List<Booking> getAllBooking() {
        return null;
    }

    @Override
    public Booking getBookingById(Integer id) {
        return null;
    }

    @Override
    public Booking getBookingByBookingId(String bookingId) {
        return null;
    }

    @Override
    public Booking getBookingByUser(User user) {
        return null;
    }

    @Override
    public Booking updateBooking(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteBooking(Booking booking) {
        return false;
    }
}
