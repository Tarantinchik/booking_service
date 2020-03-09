package com.bookingservice.dao;

import com.bookingservice.models.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    private List<Booking> bookingList = new ArrayList<>();

    public List<Booking> getBookingList() {
        return this.bookingList;
    }

    public boolean addBooking(Booking booking) {
        return this.bookingList.add(booking);
    }

    public boolean deleteBooking(Booking booking) {
        return this.bookingList.remove(booking);
    }

}
