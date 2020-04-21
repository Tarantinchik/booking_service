package com.bookingservice.services;

import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface FlightService {

    //CRUD

    //add
    boolean addFlight(String flight);

    //create
    String createFlight(int id, int seatsCapacity, int seatsLeft, String cityFrom, String cityTo, String dateFrom, String dateTo, double price);

    //readAll
    List<String> getAllFlights() throws SQLException;

    //readById
    String getFlightById(Integer id);

    //readByParams
    List<String> getFlightsByParams(List<String> params);

    //update
    String updateFlight(List<String> data);

    //delete
    boolean deleteFlight(String flight);

}