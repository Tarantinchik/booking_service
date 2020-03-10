package com.bookingservice.controllers;

import com.bookingservice.models.Flight;
import com.bookingservice.services.FlightServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class FlightControllerImpl implements FlightController {

    private FlightServiceImpl flightService = new FlightServiceImpl();


    @Override
    public boolean addFlight(Flight flight) {
        return this.flightService.addFlight(flight);
    }

    @Override
    public Flight createFlight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price) {
        return this.flightService.createFlight(seatsCapacity, cityFrom, cityTo, dateFrom, dateTo, price);
    }

    @Override
    public List<Flight> getAllFlights() {
        return this.flightService.getAllFlights();
    }

    @Override
    public Flight getFlightById(Integer id) {
        return this.flightService.getFlightById(id);
    }

    @Override
    public List<Flight> getFlightsByParams(List<String> params) {
        return this.flightService.getFlightsByParams(params);
    }

    @Override
    public Flight updateFlight(List<String> data) {
        return this.flightService.updateFlight(data);
    }

    @Override
    public boolean deleteFlight(Flight flight) {
        return this.flightService.deleteFlight(flight);
    }
}
