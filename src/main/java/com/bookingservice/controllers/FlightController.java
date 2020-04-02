package com.bookingservice.controllers;

import com.bookingservice.models.Flight;

import java.time.LocalDate;
import java.util.List;

public interface FlightController {

    //CRUD

    //add
    boolean addFlight(Flight flight);

    //create
    Flight createFlight(int id, int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price);

    //readAll
    List<Flight> getAllFlights();

    //readById
    Flight getFlightById(Integer id);

    //readByParams
    List<Flight> getFlightsByParams(List<String> params);

    //update
    Flight updateFlight(List<String> data);

    //delete
    boolean deleteFlight(Flight flight);

}
