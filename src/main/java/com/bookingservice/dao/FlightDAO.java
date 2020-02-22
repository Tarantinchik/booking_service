package com.bookingservice.dao;

import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FlightDAO {

    private List<Flight> flightList = Arrays.asList(
            new Flight(200, "Kiev", "Madrid", LocalDate.parse("2020-03-08"), LocalDate.parse("2020-03-08"), 140.00),
            new Flight(250, "Kiev", "Lisbon", LocalDate.parse("2020-03-10"), LocalDate.parse("2020-03-15"), 165.00),
            new Flight(300, "Kiev", "Praha", LocalDate.parse("2020-03-11"), LocalDate.parse("2020-03-16"), 130.00),
            new Flight(150, "Kiev", "Berlin", LocalDate.parse("2020-03-12"), LocalDate.parse("2020-03-17"), 145.00),
            new Flight(250, "Kiev", "New York", LocalDate.parse("2020-03-14"), LocalDate.parse("2020-03-20"), 300.00)
    );


    public List<Flight> getFlightList() {
        return flightList;
    }
    public boolean addFlight(Flight flight) {
        return this.flightList.add(flight);
    }

    public boolean deleteFlight(Flight flight) {
        return this.flightList.remove(flight);
    }
}
