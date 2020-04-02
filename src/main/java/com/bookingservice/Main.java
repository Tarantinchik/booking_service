package com.bookingservice;

import com.bookingservice.controllers.BookingControllerImpl;
import com.bookingservice.controllers.FlightControllerImpl;
import com.bookingservice.controllers.UserControllerImpl;
import com.bookingservice.utils.EncryptDecrypt;
import com.bookingservice.utils.Initializer;

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

        Initializer initializer = new Initializer(userController, flightController, bookingController);
        initializer.initialize();

        userController.getAllUsers().forEach(System.out::println);
        System.out.println();

        flightController.getAllFlights().forEach(System.out::println);
        System.out.println();

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