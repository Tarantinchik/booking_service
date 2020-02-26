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

    public User(List<Object> params) {
        this.login = (String) params.get(0);
        this.password = (String) params.get(1);
        this.id = counter++;
        this.firstName = (String) params.get(2);
        this.lastName = (String) params.get(3);
        this.phone = (String) params.get(4);
        this.email = (String) params.get(5);
        this.age = (int) params.get(6);
        this.countryResidence = (String) params.get(7);
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", countryResidence='" + countryResidence + '\'' +
                ", login='" + login + '\'' +
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
