package com.bookingservice.services;

import com.bookingservice.models.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface FlightService {

    //CRUD

    //Creat flight
    Flight createFlight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price);

    //Get All flights
    List<Flight> getAllFlights();

    //Get flight by id
    Flight getFlightById(Integer id);

    //Get flight by flight id
    Flight getFlightByFlightId(Integer flightId);

    //Get flights by parameters
    List<Flight> getFlightsByParams(List<String> params);

    //Update flight
    Flight updateFlight(List<String> data);

    //Delete Flight
    boolean deleteFlight(Flight flight);
}