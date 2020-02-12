package com.bookingservice.models;

import java.util.Objects;

public class Booking {

    private static int counter = 0;
    private final int id;
    private final String bookingId;
    private int seatsBooked;
    private Flight flight;
    private User user;

    public Booking(int seatsBooked, Flight flight, User user) {
        this.id = counter++;
        this.bookingId = this.id + "/" + this.hashCode();
        this.seatsBooked = seatsBooked;
        this.flight = flight;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public Flight getFlight() {
        return flight;
    }

    public User getUser() {
        return user;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", seatsBooked=" + seatsBooked +
                ", flight=" + flight +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id &&
                Objects.equals(bookingId, booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookingId);
    }
}
