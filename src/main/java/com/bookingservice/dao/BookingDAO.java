package com.bookingservice.dao;

import com.bookingservice.models.Booking;

import java.util.Arrays;
import java.util.List;

public class BookingDAO {

    private UserDAO userDAO = new UserDAO();
    private FlightDAO flightDAO = new FlightDAO();

    private List<Booking> bookingList = Arrays.asList(
            new Booking(1, this.flightDAO.getFlightList().get(0), this.userDAO.getUserList().get(0)),
            new Booking(2, this.flightDAO.getFlightList().get(1), this.userDAO.getUserList().get(1)),
            new Booking(4, this.flightDAO.getFlightList().get(2), this.userDAO.getUserList().get(2)),
            new Booking(10, this.flightDAO.getFlightList().get(3), this.userDAO.getUserList().get(3)),
            new Booking(1, this.flightDAO.getFlightList().get(4), this.userDAO.getUserList().get(4))
    );

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public boolean deleteBooking(Booking booking) {
        return this.bookingList.remove(booking);
    }
}
