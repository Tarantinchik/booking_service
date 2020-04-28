package com.bookingservice.controllers;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;
import com.bookingservice.services.BookingServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class BookingControllerImpl implements BookingController {

    private BookingServiceImpl bookingService = new BookingServiceImpl();

    @Override
    public boolean addBooking(Booking booking) {
        return this.bookingService.addBooking(booking);
    }

    @Override
    public Booking createBooking(int seatsBooked, int flightId, int userId) throws SQLException {
        return this.bookingService.createBooking(seatsBooked, flightId, userId);
    }

    @Override
    public List<Booking> getAllBookings() {
        return this.bookingService.getAllBookings();
    }

    @Override
    public Booking getBookingById(Integer id) {
        return this.bookingService.getBookingById(id);
    }

    @Override
    public Booking getBookingByUser(User user) {
        return this.bookingService.getBookingByUser(user);
    }

    @Override
    public Booking updateBooking(List<String> data) {
        return this.bookingService.updateBooking(data);
    }

    @Override
    public boolean deleteBooking(Booking booking) {
        return this.bookingService.deleteBooking(booking);
    }
}
