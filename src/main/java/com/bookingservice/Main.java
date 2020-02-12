package com.bookingservice;

import com.bookingservice.models.Admin;

public class Main {

    public static void main(String[] args) {
        Admin admin = new Admin("admin", "111111");
        String login = admin.getLogin();
        System.out.println(login);

    }
}
