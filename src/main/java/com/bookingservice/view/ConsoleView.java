package com.bookingservice.view;

import com.bookingservice.controllers.*;
import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;
import com.bookingservice.utils.Auth;
import com.bookingservice.utils.FileReaderImpl;

import java.util.List;
import java.util.Scanner;

import static com.bookingservice.utils.Constants.*;

public class ConsoleView {

    private FlightControllerImpl flightController = new FlightControllerImpl();
    private BookingControllerImpl bookingController = new BookingControllerImpl();
    private UserControllerImpl userController = new UserControllerImpl();
    private Scanner scanner;
    private int sessionId = 0;
    private User user = new User();
    //private Logger logger = new Logger();

    /**
     * Main action list
     */
    public void run() {

        FileReaderImpl fileReader = new FileReaderImpl();
        fileReader.addUsers(DATA_FILE_USERS, userController);
        fileReader.addFlights(DATA_FILE_FLIGHTS, flightController);
        fileReader.addBookings(DATA_FILE_BOOKINGS, bookingController, flightController, userController);


        Auth auth = new Auth(new User());
        String selectConsole = "";
        while (true) {
            System.out.println("[Flight booking service]");
            System.out.println("Choose action: ");
            System.out.println("[0] - Exit");
            System.out.println("[1] - Online scoreboard");
            System.out.println("[2] - View flight information");
            System.out.println("[3] - Search flight by data and booking" + (this.sessionId != 0 ? " [Session id: " + this.sessionId + "]" : " [" + this.user.getFirstName() + " " + this.user.getLastName() + "]"));
            System.out.println("[4] - Cancel booking" + (this.sessionId != 0 ? " [Session id: " + this.sessionId + "]" : " [" + this.user.getFirstName() + " " + this.user.getLastName() + "]"));
            System.out.println("[5] - Show user flights " + (this.sessionId != 0 ? " [Session id: " + this.sessionId + "]" : " [" + this.user.getFirstName() + " " + this.user.getLastName() + "]"));
            System.out.println("[6] - " + (this.sessionId == 0 ? "Log in" : "Log out [Session id: " + this.sessionId + "]"));
            System.out.println((this.sessionId == 0 ? "[7] - Registration" : ""));
            System.out.print("\nChoose your action: ");
            this.scanner = new Scanner(System.in);
            selectConsole = this.scanner.nextLine();
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
    private void select(String select) {
        switch (select) {
            case "1":
                actionOnlineScoreboard();
                break;
            case "2":
                actionViewFlightInfo();
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
                if (this.sessionId == 0) {
                    actionRegistration();
                } else {
                    System.out.println("Unknown action!");
                }
                break;
            default:
                System.out.println("Unknown action!");
        }
        System.out.println("\n\n\n");
    }

    /**
     * Shows all flights next Time
     */
    private void actionOnlineScoreboard() {
    }

    /**
     * Shows flight info by [id]
     */
    private void actionViewFlightInfo() {
        System.out.println("\n\n[View flight information]");
    }

    /**
     * Search flight and create booking
     */
    private void actionSearchFlightAndCreateBooking() {
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
    }

    /**
     * Makes registration of new users
     */
    private void actionRegistration() {
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