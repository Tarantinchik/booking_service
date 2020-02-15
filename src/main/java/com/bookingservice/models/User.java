package com.bookingservice.models;

import java.util.Objects;

public class User extends SuperUser {

    private static int counter = 0;
    private final int id;
    private final String firstName;
    private final String lastName;
    private String phone;
    private String email;
    private int age;
    private String countryResidence;
    private String token;

    public User(String login, String password, String firstName, String lastName, String phone, String email, int age, String countryResidence) {
        super(login, password);
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.countryResidence = countryResidence;
        this.token = "";
    }

    public int getId() {
        return id;
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

    public void setAge(int age) {
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", countryResidence='" + countryResidence + '\'' +
                ", login='" + this.getLogin() + '\'' +
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
