package com.bookingservice.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Flight {

    private final Integer id;
    private Integer seatsCapacity;
    private Integer seatsLeft;
    private String cityFrom;
    private String cityTo;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private Double price;

    public Flight(int id, int seatsCapacity, int seatsLeft, String cityFrom, String cityTo, String dateFrom, String dateTo, double price) {
        this.id = id;
        this.seatsCapacity = seatsCapacity;
        this.seatsLeft = seatsLeft;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.dateFrom = LocalDate.parse(dateFrom, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.dateTo = LocalDate.parse(dateTo, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.price = price;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Flight [" +
                "id=" + id +
                ", seatsCapacity=" + seatsCapacity +
                ", seatsLeft=" + seatsLeft +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + price +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id.equals(flight.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}