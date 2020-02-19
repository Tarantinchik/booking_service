package com.bookingservice.dao;

import com.bookingservice.models.User;

import java.util.Arrays;
import java.util.List;

public class UserDAO {

    private List<User> userList = Arrays.asList(
            new User("Murka", "1234567", "Saha", "Gulieva", "34567843", "saha@test.com", 34, "Uzbekistan"),
            new User("Kapitoshka", "1234567", "Dasha", "Gromova", "345645327", "iza@test.com", 24, "Belorussia"),
            new User("Doctor", "1234567", "Kirill", "Ivanov", "345645324", "kira@test.com", 29, "Bulgaria"),
            new User("Hirurg", "1234567", "Igor", "Britskiy", "345645321", "igor@test.com", 39, "Ukraine"),
            new User("Umnik", "1234567", "Alex", "Shvartc", "345645329", "alex@gmail.com", 49, "USA")
    );

    public List<User> getUserList() {
        return userList;
    }

    public boolean addUser(User user) {
        return this.userList.add(user);
    }

    public boolean deleteUser(User user) {
        return this.userList.remove(user);
    }
}