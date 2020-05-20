package com.bookingservice;

import com.bookingservice.utils.CrunchifyJSONReadFromFile;
import com.bookingservice.utils.Parser;
import com.bookingservice.view.ConsoleView;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {

        new ConsoleView().run();

//        CrunchifyJSONReadFromFile jsonReadFromFile = new CrunchifyJSONReadFromFile("src/main/resources/json/trello.json");
//        String jsonObject = jsonReadFromFile.getStringFromFile();
//
//        Parser parser = new Parser();
//
//        parser.getArrayItemsBySubArrayName(jsonObject.toString(), "id");

    }

}