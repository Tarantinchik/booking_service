package com.bookingservice.utils;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CrunchifyJSONReadFromFile {

    private final String filePath;

    public CrunchifyJSONReadFromFile(String filePath) {
        this.filePath = filePath;
    }

    public JSONObject getJsonObject() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(new Scanner(new File(filePath)).useDelimiter("\\Z").next());
        } catch (Exception e) {
            System.out.println("Something was wrong!");
        }
        return jsonObject;
    }

    public String getStringFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

}