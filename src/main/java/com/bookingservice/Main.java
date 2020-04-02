package com.bookingservice;

import com.bookingservice.db.DBConnector;
import com.bookingservice.db.DBWorker;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;
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
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, NoSuchPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {

        //new ConsoleView().run();
        DBConnector connector = new DBConnector();
        DBWorker worker = new DBWorker(connector.getDBConnection());
        List<User> usersFromDB = worker.getUsersFromDB();
        //usersFromDB.forEach(System.out::println);

        List<Flight> flightsFromDB = worker.getFlightsFromDB();
        flightsFromDB.forEach(System.out::println);

        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        String password = "1234567890";

        String encrypt = encryptDecrypt.encrypt(password);
        System.out.println(encrypt);

        String decrypt = encryptDecrypt.decrypt(encrypt);
        System.out.println(decrypt);
    }

}