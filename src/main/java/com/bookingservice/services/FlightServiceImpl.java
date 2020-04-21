package com.bookingservice.services;

import com.bookingservice.db.DBService;

import java.sql.SQLException;
import java.util.List;

public class FlightServiceImpl implements FlightService {

    private final DBService dbService = new DBService();

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
        return this.dbService.getFlights();
    }

    @Override
    public String getFlightById(Integer id) throws SQLException {
        return this.dbService.getFlightById(id);
    }

    @Override
    public List<String> getFlightsByParams(List<String> params) {
        return null;
    }

    @Override
    public String updateFlight(List<String> data) {
        return null;
    }

    @Override
    public boolean deleteFlight(String flight) {
        return true;
    }
}
