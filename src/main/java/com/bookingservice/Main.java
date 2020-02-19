package com.bookingservice;

import com.bookingservice.controllers.UserControllerImpl;

public class Main {

    public static void main(String[] args) {
        UserControllerImpl userController = new UserControllerImpl();
        //userController.getAllUsers().forEach(System.out::println);
        System.out.println(userController.getUsersById(12));
    }
}
