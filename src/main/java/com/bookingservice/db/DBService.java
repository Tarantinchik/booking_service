package com.bookingservice.db;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    private final Connection connection = ;
    private PreparedStatement ps;
    private ResultSet resultSet;
    private String query;

    public DBService(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public List<String> getUsersFromDB() throws SQLException {
        query = "SELECT * FROM users;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(
                    resultSet.getInt("id") + " "
                    + resultSet.getString("login") + " "
                    + resultSet.getString("password") + " "
                    + resultSet.getString("first_name") + " "
                    + resultSet.getString("last_name") + " "
                    + resultSet.getString("phone") + " "
                    + resultSet.getString("email") + " "
                    + resultSet.getInt("age") + " "
                    + resultSet.getString("country_residence"));

//            User user = new User(
//                    resultSet.getInt("id"),
//                    resultSet.getString("login"),
//                    resultSet.getString("password"),
//                    resultSet.getString("first_name"),
//                    resultSet.getString("last_name"),
//                    resultSet.getString("phone"),
//                    resultSet.getString("email"),
//                    resultSet.getInt("age"),
//                    resultSet.getString("country_residence")
//            );
            //userController.addUser(user);
        }
        return users;
    }

    public List<String> getFlightsFromDB() throws SQLException {
        List<Flight> flightList = new ArrayList<>();
        query = "SELECT * FROM flights;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> flights = new ArrayList<>();
        while (resultSet.next()) {
            flights.add(
                    resultSet.getInt("id") + " "
                    + resultSet.getInt("seats_capacity") + " "
                    + resultSet.getInt("seats_left") + " "
                    + resultSet.getString("city_from") + " "
                    + resultSet.getString("city_to") + " "
                    + resultSet.getString("date_from") + " "
                    + resultSet.getString("date_to") + " "
                    + resultSet.getDouble("price"));

//            Flight flight = new Flight(
//                    resultSet.getInt("id"),
//                    resultSet.getInt("seats_capacity"),
//                    resultSet.getInt("seats_left"),
//                    resultSet.getString("city_from"),
//                    resultSet.getString("city_to"),
//                    resultSet.getString("date_from"),
//                    resultSet.getString("date_to"),
//                    resultSet.getDouble("price")
//            );
//            flightController.addFlight(flight);
        }
        return flights;
    }

    public List<String> getBookingsFromDB() throws SQLException {
        List<Booking> bookingList = new ArrayList<>();
        query = "SELECT * FROM bookings;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> bookings = new ArrayList<>();
        while (resultSet.next()) {
//            Flight flight = flightController.getFlightById(resultSet.getInt("flight_id"));
//            User user = userController.getUserById(resultSet.getInt("user_id"));
            bookings.add(
                    resultSet.getInt("id") + " "
                    + resultSet.getInt("seats_booked") + " "
                    + resultSet.getInt("flight_id") + " "
                    + resultSet.getInt("user_id")
            );
//            Booking booking = new Booking(
//                    resultSet.getInt("id"),
//                    resultSet.getInt("seats_booked"),
//                    flight,
//                    user
//            );
//            bookingController.addBooking(booking);
        }
        return bookings;
    }
}
