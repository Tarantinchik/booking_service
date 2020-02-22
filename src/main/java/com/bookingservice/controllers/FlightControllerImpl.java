package com.bookingservice.controllers;

import com.bookingservice.models.Flight;

import java.time.LocalDate;
import java.util.List;

public class FlightControllerImpl implements FlightController {
    @Override
    public Flight createFlight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price) {
        return null;
    }

    @Override
    public List<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightById(Integer id) {
        return null;
    }

    @Override
    public Flight getFlightByFlightId(String flightId) {
        return null;
    }

    @Override
    public List<Flight> getFlightsByParams(List<String> params) {
        return null;
    }

    @Override
    public Flight updateFlight(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteFlight(Flight flight) {
        return false;
    }
}
