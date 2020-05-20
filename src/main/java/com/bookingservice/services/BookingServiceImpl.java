package com.bookingservice.services;

import com.bookingservice.dao.BookingDAO;
import com.bookingservice.db.DBService;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.sql.SQLException;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    private final DBService dbService = new DBService();

    @Override
    public boolean addBooking(Booking booking) {
        return false;
        //return this.bookingDAO.addBooking(booking);
    }

    @Override
    public boolean createBooking(int seatsBooked, int flightId, int userId) throws SQLException {
        return this.dbService.createBooking(seatsBooked, flightId, userId);
    }

    @Override
    public List<Booking> getAllBookings() {
        return null;
        //return this.bookingDAO.getBookingList();
    }

    @Override
    public Booking getBookingById(Integer id) {
//        return this.bookingDAO.getBookingList()
//                .stream()
//                .filter(booking -> id.equals(booking.getId()))
//                .findFirst()
//                .orElse(null);
        return null;
    }

    @Override
    public Booking getBookingByUser(User user) {
//        return this.bookingDAO.getBookingList()
//                .stream()
//                .filter(booking -> user.equals(booking.getUser()))
//                .findFirst()
               // .orElse(null);
        return null;
    }

    @Override
    public Booking updateBooking(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteBooking(int bookingId) throws SQLException {
        return this.dbService.deleteBooking(bookingId);
    }

    public List<String> getBookingsByUserId(int id) throws SQLException {
        return this.dbService.getBookingsByUserId(id);
    }
}
