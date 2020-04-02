package com.bookingservice.services;

import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {

    //CRUD

    //add
    boolean addFlight(Flight flight);

    //create
    Flight createFlight(int id, int seatsCapacity, int seatsLeft, String cityFrom, String cityTo, String dateFrom, String dateTo, double price);

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