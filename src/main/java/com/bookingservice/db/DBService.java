package com.bookingservice.db;

import com.bookingservice.models.Booking;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    public List<String> getUsers() throws SQLException {
        Connection connection = new DBConnector().getDBConnection();
        String query = "SELECT * FROM users;";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();
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
        Connection connection = new DBConnector().getDBConnection();
        String query = "SELECT * FROM flights;";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();
        List<String> flights = new ArrayList<>();
        if (!resultSet.next()) {
            InputStream asciiStream = resultSet.getAsciiStream(1);
            flights.add(
                    resultSet.getInt("id") + "   "
                            + resultSet.getInt("seats_capacity") + "   "
                            + resultSet.getInt("seats_left") + "   "
                            + resultSet.getString("city_from") + "   "
                            + resultSet.getString("city_to") + "   "
                            + resultSet.getString("date_from") + "   "
                            + resultSet.getString("date_to") + "   "
                            + resultSet.getDouble("price"));
        } else {
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
        }
        connection.close();
        return flights;
    }

    public List<String> getBookings() throws SQLException {
        Connection connection = new DBConnector().getDBConnection();
        String query = "SELECT * FROM bookings;";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();
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
        if (id > 0 && id < 10000) {
            Connection connection = new DBConnector().getDBConnection();
            String query = "SELECT * FROM flights WHERE id = ?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (!resultSet.next()) {
                InputStream asciiStream = resultSet.getAsciiStream(1);
            }

//            if (resultSet.getInt("id") != null) {
//
//            }
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
        } else {
            return "[]";
        }
    }

    public Booking createBooking(int seatsBooked, int flightId, int userId) throws SQLException {
        Connection connection = new DBConnector().getDBConnection();
        String query = "INSERT INTO bookings values (null, ?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(query);

        ps.setInt(1, seatsBooked);
        ps.setInt(2, flightId);
        ps.setInt(3, userId);

        ResultSet resultSet = ps.executeQuery(query);
        connection.close();
        return null;
    }

    public List<Object> getUserDataByID(int id) throws SQLException {
        if (id < 0 || id > 9999) {
            return null;
        }
        Connection connection = new DBConnector().getDBConnection();
        String query = "SELECT * FROM users WHERE id = ?;";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        List<Object> userDataList = new ArrayList<>();

        if (!resultSet.next()) {
            InputStream asciiStream = resultSet.getAsciiStream(1);
        }
        userDataList.add(resultSet.getInt("id"));
        userDataList.add(resultSet.getString("login"));
        userDataList.add(resultSet.getString("password"));
        userDataList.add(resultSet.getString("first_name"));
        userDataList.add(resultSet.getString("last_name"));
        userDataList.add(resultSet.getString("phone"));
        userDataList.add(resultSet.getString("email"));
        userDataList.add(resultSet.getInt("age"));
        userDataList.add(resultSet.getString("country_residence"));
        connection.close();
        return userDataList;
    }

    public List<String> getBookingsByUserId(int id) throws SQLException {
        if (id < 0 || id > 9999) {
            return null;
        }

        Connection connection = new DBConnector().getDBConnection();
        String query = "SELECT * FROM bookings WHERE user_id = ?;";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        List<String> bookingList = new ArrayList<>();

        if (!resultSet.next()) {
            InputStream asciiStream = resultSet.getAsciiStream(1);
            bookingList.add(
                    resultSet.getInt("id") + "   "
                            + resultSet.getInt("seats_booked") + "   "
                            + resultSet.getInt("flight_id") + "   "
                            + resultSet.getInt("user_id")
            );
        } else {
            while (resultSet.next()) {
                bookingList.add(
                        resultSet.getInt("id") + "   "
                                + resultSet.getInt("seats_booked") + "   "
                                + resultSet.getInt("flight_id") + "   "
                                + resultSet.getInt("user_id")
                );
            }
        }
        connection.close();
        return bookingList;
    }
}