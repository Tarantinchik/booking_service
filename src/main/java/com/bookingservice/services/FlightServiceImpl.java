package com.bookingservice.services;

import com.bookingservice.dao.FlightDAO;
import com.bookingservice.models.Flight;

import java.time.LocalDate;
import java.util.List;

public class FlightServiceImpl implements FlightService {

    private FlightDAO flightDAO = new FlightDAO();

    @Override
    public boolean addFlight(Flight flight) {
        return this.flightDAO.addFlight(flight);
    }

    @Override
    public Flight createFlight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price) {
        return new Flight(seatsCapacity, cityFrom, cityTo, dateFrom, dateTo, price);
    }

    @Override
    public List<Flight> getAllFlights() {
        return this.flightDAO.getFlightList();
    }

    @Override
    public Flight getFlightById(Integer id) {
        return this.flightDAO.getFlightList()
                .stream()
                .filter(flight -> id.equals(flight.getId()))
                .findFirst()
                .orElse(null);
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
        return this.flightDAO.deleteFlight(flight);
    }
}
