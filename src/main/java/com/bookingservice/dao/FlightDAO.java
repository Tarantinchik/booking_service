package com.bookingservice.dao;

import com.bookingservice.models.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    private List<Flight> flightList = new ArrayList<>();

    public List<Flight> getFlightList() {
        return this.flightList;
    }

    public boolean addFlight(Flight flight) {
        return this.flightList.add(flight);
    }

    public boolean deleteFlight(Flight flight) {
        return this.flightList.remove(flight);
    }

}