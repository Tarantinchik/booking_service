package com.bookingservice.utils;

import com.bookingservice.controllers.ControllerImpl;
import com.bookingservice.models.User;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FileReader<T> {

    private final String filePath;
    private final ControllerImpl<T> controller = new ControllerImpl<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<T> getObjectList(Class<T> clazz) {

        List<Object> objectList = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(this.filePath))) {
            stream.forEach(e -> {
                String[] s = e.split(" ");
                List<String> strings = Arrays.asList(s);

                Constructor<?>[] constructors = clazz.getDeclaredConstructors();

                Field[] fields = clazz.getDeclaredFields();
                for (int i = 2; i < fields.length; i++) {
                    Class<?> type = fields[i].getType();
                    objectList.add(s[i - 2]);
                }




                try {
                    controller.create(clazz, objectList);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException ex) {
                    ex.printStackTrace();
                }
            });

        } catch (IOException e) {
            System.out.println("Error file read!");
        }


        return null;
    }

}