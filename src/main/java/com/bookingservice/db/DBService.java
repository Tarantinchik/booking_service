package com.bookingservice.db;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    private final Connection connection = new DBConnector().getDBConnection();
    private PreparedStatement ps;
    private ResultSet resultSet;
    private String query;

    public List<String> getUsers() throws SQLException {
        query = "SELECT * FROM users;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(
                    resultSet.getInt("id") + "   "
                            + resultSet.getString("login") + "   "
                            + resultSet.getString("password") + "   "
                            + resultSet.getString("first_name") + "   "
                            + resultSet.getString("last_name") + "   "
                            + resultSet.getString("phone") + "   "
                            + resultSet.getString("email") + "   "
                            + resultSet.getInt("age") + "   "
                            + resultSet.getString("country_residence"));
        }
        connection.close();
        return users;
    }

    public List<String> getFlights() throws SQLException {
        query = "SELECT * FROM flights;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> flights = new ArrayList<>();
        while (resultSet.next()) {
            flights.add(
                    resultSet.getInt("id") + "   "
                            + resultSet.getInt("seats_capacity") + "   "
                            + resultSet.getInt("seats_left") + "   "
                            + resultSet.getString("city_from") + "   "
                            + resultSet.getString("city_to") + "   "
                            + resultSet.getString("date_from") + "   "
                            + resultSet.getString("date_to") + "   "
                            + resultSet.getDouble("price"));
        }
        connection.close();
        return flights;
    }

    public List<String> getBookings() throws SQLException {
        query = "SELECT * FROM bookings;";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();
        List<String> bookings = new ArrayList<>();
        while (resultSet.next()) {
            bookings.add(
                    resultSet.getInt("id") + "   "
                            + resultSet.getInt("seats_booked") + "   "
                            + resultSet.getInt("flight_id") + "   "
                            + resultSet.getInt("user_id")
            );
        }
        connection.close();
        return bookings;
    }

    public String getFlightById(Integer id) throws SQLException {
        query = "SELECT * FROM flights WHERE id = ?;";
        ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        resultSet = ps.executeQuery();
        if (!resultSet.next()){
            InputStream asciiStream = resultSet.getAsciiStream(1);
        }
        String flight =
                    resultSet.getInt("id") + "   "
                    + resultSet.getInt("seats_capacity") + "   "
                    + resultSet.getInt("seats_left") + "   "
                    + resultSet.getString("city_from") + "   "
                    + resultSet.getString("city_to") + "   "
                    + resultSet.getString("date_from") + "   "
                    + resultSet.getString("date_to") + "   "
                    + resultSet.getDouble("price");
        connection.close();
        return flight;
    }

}