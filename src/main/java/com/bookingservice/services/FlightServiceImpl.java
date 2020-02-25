package com.bookingservice.services;

import com.bookingservice.models.Flight;

import java.time.LocalDate;
import java.util.List;

public class FlightServiceImpl {

//    private FlightDAO flightDAO = new FlightDAO();
//
//    @Override
//    public Flight createFlight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price) {
//        return new Flight(seatsCapacity, cityFrom, cityTo, dateFrom, dateTo, price);
//    }
//
//    @Override
//    public List<Flight> getAllFlights() {
//        return this.flightDAO.getFlightList();
//    }
//
//    @Override
//    public Flight getFlightById(Integer id) {
//        return this.flightDAO.getFlightList()
//                .stream()
//                .filter(flight -> id.equals(flight.getId()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public Flight getFlightByFlightId(String flightId) {
//        return this.flightDAO.getFlightList()
//                .stream()
//                .filter(flight -> flightId.equals(flight.getFlightId()))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public List<Flight> getFlightsByParams(List<String> params) {
//        return null;
////        return this.flightDAO.getFlightList()
////                .stream()
////                .filter(flight -> {
////                    params
////                            .stream()
////                            .map(param -> param.equals(flight));
////                })
////                .findFirst()
////                .orElse();
//    }
//
//    @Override
//    public Flight updateFlight(List<String> data) {
//        return null;
//    }
//
//    @Override
//    public boolean deleteFlight(Flight flight) {
//        return this.flightDAO.deleteFlight(flight);
//    }
}
