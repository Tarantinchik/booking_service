package com.bookingservice.services;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.util.List;

public class BookingServiceImpl {

//   private BookingDAO bookingDAO = new BookingDAO();
//
//    @Override
//    public Booking createBooking(int seatsBooked, Flight flight, User user) {
//        return new Booking(seatsBooked, flight, user);
//    }
//
//    @Override
//    public List<Booking> getAllBooking() {
//        return this.bookingDAO.getBookingList();
//    }
//
//    @Override
//    public Booking getBookingById(Integer id) {
//        return this.bookingDAO.getBookingList()
//                .stream()
//                .filter(booking -> id.equals(booking.getId()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public Booking getBookingByBookingId(String bookingId) {
//      return this.bookingDAO.getBookingList()
//                .stream()
//                .filter(booking -> bookingId.equals(booking.getBookingId()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public Booking getBookingByUser(User user) {
//        return this.bookingDAO.getBookingList()
//                .stream()
//                .filter(booking -> user.equals(booking.getUser()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public Booking updateBooking(List<String> data) {
//        return null;
//    }
//
//    @Override
//    public boolean deleteBooking(Booking booking) {
//        return this.bookingDAO.deleteBooking(booking);
//    }
}
