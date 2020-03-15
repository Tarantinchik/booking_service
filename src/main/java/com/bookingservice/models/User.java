package com.bookingservice.models;

import java.util.List;
import java.util.Objects;

public class User {

    private static int counter = 0;
    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Integer age;
    private String countryResidence;
    private String token;

    public User(String login, String password, String firstName, String lastName, String phone, String email, Integer age, String countryResidence) {
        this.id = counter++;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.countryResidence = countryResidence;
        this.token = "";
    }

    public User() {
        this.login = "Unknown";
        this.password = "Unknown";
        this.id = -1; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        this.firstName = "Guest";
        this.lastName = "Guest";
        this.phone = "Unknown";
        this.email = "Unknown";
        this.age = 0;
        this.countryResidence = "Unknown"; //!!!!!!!!! Country -> IP
        this.token = "";
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCountryResidence() {
        return countryResidence;
    }

    public String getToken() {
        return token;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCountryResidence(String countryResidence) {
        this.countryResidence = countryResidence;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", countryResidence='" + countryResidence + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, phone, email);
    }
}
