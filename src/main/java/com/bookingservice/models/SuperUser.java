package com.bookingservice.models;

import java.util.Objects;

public abstract class SuperUser {

    private String login;
    private String password;

    public SuperUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperUser superUser = (SuperUser) o;
        return Objects.equals(login, superUser.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
