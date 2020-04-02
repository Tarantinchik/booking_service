package com.bookingservice.db;

import com.bookingservice.dao.FlightDAO;
import com.bookingservice.dao.UserDAO;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBWorker {

    private final Connection connection;
    private PreparedStatement ps;
    private ResultSet resultSet;
    String query;
    private UserDAO userDAO = new UserDAO();
    private FlightDAO flightDAO = new FlightDAO();

    public DBWorker(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public List<User> getUsersFromDB() throws SQLException {
        List<User> userList = new ArrayList<>();
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
            userList.add(user);
        }
        userDAO.getUserList().addAll(userList);
        return userList;
    }

    public List<Flight> getFlightsFromDB() throws SQLException {
        List<Flight> flights = new ArrayList<>();
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
            flights.add(flight);
        }
        flightDAO.getFlightList().addAll(flights);
        return flights;
    }
}
