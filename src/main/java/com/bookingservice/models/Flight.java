package com.bookingservice.models;

import java.time.LocalDate;

public class Flight {
    private static int countId;
    private final int id;
    private final String flightId;
    private final int seatsCapacity;
    private int seatsLeft;
    private String cityFrom;
    private String cityTo;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double price;

    public Flight(int seatsCapacity, String cityFrom, String cityTo, LocalDate dateFrom, LocalDate dateTo, double price) {
        this.id = countId++;
        this.flightId = this.id + "/" + this.hashCode();
        this.seatsCapacity = seatsCapacity;
        this.seatsLeft = this.seatsCapacity;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getFlightId() {
        return flightId;
    }

    public int getSeatsCapacity() {
        return seatsCapacity;
    }

    public int getSeatsLeft() {
        return seatsLeft;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public double getPrice() {
        return price;
    }

    public void setSeatsLeft(int seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


