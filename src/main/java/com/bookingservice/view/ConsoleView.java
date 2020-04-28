package com.bookingservice.view;

import com.bookingservice.controllers.*;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;
import com.bookingservice.utils.Auth;
import com.bookingservice.utils.FileReaderImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import static com.bookingservice.utils.Constants.*;

public class ConsoleView {

    private FlightControllerImpl flightController = new FlightControllerImpl();
    private BookingControllerImpl bookingController = new BookingControllerImpl();
    private UserControllerImpl userController = new UserControllerImpl();
    private User user = new User();
    private Auth auth = new Auth(user, this.userController);
    //private int sessionId = 0;
    //private Logger logger = new Logger();

    /**
     * Main action list
     */
    public void run() throws SQLException {

        FileReaderImpl fileReader = new FileReaderImpl();
        fileReader.addUsers(DATA_FILE_USERS, userController);
        fileReader.addFlights(DATA_FILE_FLIGHTS, flightController);
        fileReader.addBookings(DATA_FILE_BOOKINGS, bookingController, flightController, userController);

        String selectConsole = "";
        this.user.setToken("1");
        while (true) {
            System.out.println("[Flight booking service]\n");
            System.out.println("Hi, " + this.user.getFirstName() + " " + this.user.getLastName() + "\n");
            System.out.println("Choose action: ");
            System.out.println("[0] - Exit");
            System.out.println("[1] - Online scoreboard");
            System.out.println("[2] - View flight information");

            if (!this.user.getToken().equals("")) {
                System.out.println("[3] - Search flight by data and booking");
                System.out.println("[4] - Cancel booking");
                System.out.println("[5] - Show user flights");
                System.out.println("[6] - Log out [Token: " + this.user.getToken() + "]");
            } else {
                System.out.println("[6] - Log in");
                System.out.println("[7] - Registration");
            }
            System.out.print("\nChoose your action: ");

            Scanner scanner = new Scanner(System.in);
            selectConsole = scanner.nextLine();
            if (selectConsole.equals(EXIT)) {
                System.out.println("Thank you for using our service!");
                break;
            } else {
                select(selectConsole);
            }
        }
    }

    /**
     * Action selector
     *
     * @param select as String
     */
    private void select(String select) throws SQLException {
        switch (select) {
            case "1":
                actionOnlineScoreboard();
                break;
            case "2":
                actionViewFlightInfoById();
                break;
            case "3":
                actionSearchFlightAndCreateBooking();
                break;
            case "4":
                actionCancelBooking();
                break;
            case "5":
                actionGetUserBookings();
                break;
            case "6":
                actionUserLogInOut();
                break;
            case "7":
                actionRegistration();
                break;
            default:
                System.out.println("Unknown action!");
        }
        System.out.println("\n\n\n");
    }

    /**
     * Shows all flights next Time
     */
    private void actionOnlineScoreboard() throws SQLException {
        this.flightController.getAllFlights().forEach(System.out::println);
    }

    /**
     * Shows flight info by [id]
     */
    private void actionViewFlightInfoById() {
        System.out.println("\n\n[View flight information]");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input flight [id]: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0 && id < 10000) {
                    break;
                } else {
                    System.out.println("Error input number value! Try again...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error input number type! Try again...");
            }
        }

        String flightById = null;
        try {
            flightById = this.flightController.getFlightById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(flightById);
    }

    /**
     * Search flight and create booking
     */
    private void actionSearchFlightAndCreateBooking() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input flight id: ");
        int flightId = Integer.parseInt(scanner.nextLine());
        System.out.println();

        System.out.print("Input seats booked: ");
        int seatsBooked = Integer.parseInt(scanner.nextLine());
        System.out.println();

        int userId = this.user.getId();

        this.bookingController.createBooking(seatsBooked, flightId, userId);
    }

    /**
     * Create new booking
     *
     * @param flightList List<FlightModel>
     * @param tickets    int
     */
    private void createBooking(List<Flight> flightList, int tickets) {
    }

    /**
     * Cancel booking by [id]
     */
    private void actionCancelBooking() {
    }

    /**
     * Returns users's bookings (only for authorized users!)
     */
    private void actionGetUserBookings() {
    }

    /**
     * Makes Log In/Out for users
     */
    private void actionUserLogInOut() {
        if(!this.user.getToken().equals("")) {
            this.user = new User();
        } else {
            System.out.println("\n\n[Input login and password]");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            User logInUser = this.userController.getUserByLoginAndPassword(login, password);
            if (logInUser != null) {
                this.user = logInUser;
                this.user.setToken(String.valueOf(this.user.hashCode()));
            } else {
                System.out.println(USER_UNKNOWN);
            }
        }
    }

    /**
     * Makes registration of new users
     */
    private boolean actionRegistration() {
        System.out.println("\n\n[Registration service]");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Age: ");
        String ageStr = scanner.nextLine();
        int age = Integer.parseInt(ageStr);
        System.out.print("Country residence: ");
        String countryResidence = scanner.nextLine();
        return true;

//        return this.auth.registration(id, login, password, firstName, lastName, phone, email, age, countryResidence);
    }

    /**
     * Prints flight collection
     *
     * @param list as ArrayList<>(FlightModel)
     */
    private void printFlightList(List<Flight> list) {
    }

    /**
     * Prints booking collection
     *
     * @param list as ArrayList<>(BookingModel)
     */
    private void printBookingList(List<Booking> list) {
    }

}