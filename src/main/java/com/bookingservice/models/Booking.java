package com.bookingservice.models;

import java.util.Objects;

public class Booking {

    private final Integer id;
    private Integer seatsBooked;
    private Flight flight;
    private User user;

    public Booking(int id, int seatsBooked, Flight flight, User user) {
        this.id = id;
        this.seatsBooked = seatsBooked;
        this.flight = flight;
        this.user = user;
    }

    public int getId() {
        return id;
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
        return "Booking [" +
                "id=" + id +
                ", seatsBooked=" + seatsBooked +
                ", flight_id=" + flight.getId() +
                ", user_id=" + user.getId() +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id.equals(booking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}