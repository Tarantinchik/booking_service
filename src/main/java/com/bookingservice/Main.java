package com.bookingservice;

import com.bookingservice.controllers.UserControllerImpl;

public class Main {

    public static void main(String[] args) {
        UserControllerImpl userController = new UserControllerImpl();
        //userController.getAllUsers().forEach(System.out::println);
        System.out.println(userController.getUsersById(1));



        //Entity<String> e1 = new Entity<>();
//        e1.print("yyyyy");
//
//        Entity<Integer> e2 = new Entity<>();
//        e2.print(23232323);
    }
}
