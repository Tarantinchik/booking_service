package com.bookingservice;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.db.DBConnector;
import com.bookingservice.db.DBWorker;
import com.bookingservice.utils.EncryptDecrypt;
import com.bookingservice.view.ConsoleView;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws NoSuchPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, SQLException {

        UserControllerImpl userController = new UserControllerImpl();
        FlightControllerImpl flightController = new FlightControllerImpl();
        BookingControllerImpl bookingController = new BookingControllerImpl();

        //new ConsoleView().run();
        DBConnector connector = new DBConnector();
        DBWorker worker = new DBWorker(connector.getDBConnection(), userController, flightController, bookingController);

        worker.getUsersFromDB();
        userController.getAllUsers().forEach(System.out::println);
        System.out.println();

        worker.getFlightsFromDB();
        flightController.getAllFlights().forEach(System.out::println);
        System.out.println();

        worker.getBookingsFromDB();
        bookingController.getAllBookings().forEach(System.out::println);
        System.out.println();

        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        String password = "1234567890";

        String encrypt = encryptDecrypt.encrypt(password);
        System.out.println(encrypt);

        String decrypt = encryptDecrypt.decrypt(encrypt);
        System.out.println(decrypt);
    }

}