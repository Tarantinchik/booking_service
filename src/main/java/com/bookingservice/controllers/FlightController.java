package com.bookingservice.controllers;

import com.bookingservice.models.Flight;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface FlightController {

    //CRUD

    //add
    boolean addFlight(String flight);

    //create
    String createFlight(int id, int seatsCapacity, int seatsLeft, String cityFrom, String cityTo, String dateFrom, String dateTo, double price);

    //readAll
    List<String> getAllFlights() throws SQLException;

    //readById
    String getFlightById(Integer id) throws SQLException;

    //readByParams
    List<String> getFlightsByParams(List<String> params);

    //update
    String updateFlight(List<String> data);

    //delete
    boolean deleteFlight(String flight);

}
