package com.bookingservice.utils;

import com.bookingservice.controllers.ControllerImpl;
import com.bookingservice.models.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    private final String filePath;
    private final ControllerImpl<User> userController = new ControllerImpl<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<User> getObjectList() {
        List<User> userList = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(this.filePath))) {

            stream.forEach(e -> {
                String[] s = e.split(" ");
                List<String> strings = Arrays.asList(s);

                try {
                    User.class.getConstructor()
                } catch (NoSuchMethodException ex) {
                    ex.printStackTrace();
                }

                try {
                    userController.create(User.class, objectList);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException ex) {
                    ex.printStackTrace();
                }
            });

        } catch (IOException e) {
            System.out.println("Error file read!");
        }


        return userList;
    }

}