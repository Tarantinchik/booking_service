package com.bookingservice.db;

import com.bookingservice.controllers.*;
import com.bookingservice.dao.BookingDAO;
import com.bookingservice.dao.FlightDAO;
import com.bookingservice.dao.UserDAO;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBWorker {

    private final Connection connection;
    private PreparedStatement ps;
    private ResultSet resultSet;
    private String query;

    private UserControllerImpl userController;
    private FlightControllerImpl flightController;
    private BookingControllerImpl bookingController;

    public DBWorker(Connection connection, UserControllerImpl userController, FlightControllerImpl flightController, BookingControllerImpl bookingController) {
        this.connection = connection;
        this.userController = userController;
        this.flightController = flightController;
        this.bookingController = bookingController;
    }

    public Connection getConnection() {
        return connection;
    }

    public void getUsersFromDB() throws SQLException {
        String query = "SELECT * FROM users;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        while (resultSet.next()) {
            User user = new User(
                    resultSet.getInt("id"),
                    resultSet.getString("login"),
                    resultSet.getString("password"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("phone"),
                    resultSet.getString("email"),
                    resultSet.getInt("age"),
                    resultSet.getString("country_residence")
            );
            userController.addUser(user);
        }
    }

    public void getFlightsFromDB() throws SQLException {
        List<Flight> flightList = new ArrayList<>();
        query = "SELECT * FROM flights;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        while (resultSet.next()) {
            Flight flight = new Flight(
                    resultSet.getInt("id"),
                    resultSet.getInt("seats_capacity"),
                    resultSet.getInt("seats_left"),
                    resultSet.getString("city_from"),
                    resultSet.getString("city_to"),
                    resultSet.getString("date_from"),
                    resultSet.getString("date_to"),
                    resultSet.getDouble("price")
            );
            flightController.addFlight(flight);
        }
    }

    public void getBookingsFromDB() throws SQLException {
        List<Booking> bookingList = new ArrayList<>();
        query = "SELECT * FROM bookings;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        while (resultSet.next()) {
            Flight flight = flightController.getFlightById(resultSet.getInt("flight_id"));
            User user = userController.getUserById(resultSet.getInt("user_id"));
            Booking booking = new Booking(
                    resultSet.getInt("id"),
                    resultSet.getInt("seats_booked"),
                    flight,
                    user
            );
            bookingController.addBooking(booking);
        }
    }
}
