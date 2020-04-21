package com.bookingservice.controllers;

import com.bookingservice.services.FlightServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class FlightControllerImpl implements FlightController {

    private FlightServiceImpl flightService = new FlightServiceImpl();

    @Override
    public boolean addFlight(String flight) {
        return true;
    }

    @Override
    public String createFlight(int id, int seatsCapacity, int seatsLeft, String cityFrom, String cityTo, String dateFrom, String dateTo, double price) {
        return null;
    }

    @Override
    public List<String> getAllFlights() throws SQLException {
        return this.flightService.getAllFlights();
    }

    @Override
    public String getFlightById(Integer id) {
        return this.flightService.getFlightById(id);
    }

    @Override
    public List<String> getFlightsByParams(List<String> params) {
        return this.flightService.getFlightsByParams(params);
    }

    @Override
    public String updateFlight(List<String> data) {
        return this.flightService.updateFlight(data);
    }

    @Override
    public boolean deleteFlight(String flight) {
        return true;
    }
}
