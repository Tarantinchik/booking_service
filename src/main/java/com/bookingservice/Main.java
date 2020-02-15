package com.bookingservice;

import com.bookingservice.models.Admin;
import com.bookingservice.models.SuperUser;

public class Main {

    public static void main(String[] args) {
        SuperUser admin = new Admin("admin", "111111");
        String login = admin.getLogin();
        System.out.println(login);

    }
}
