package com.example.f;

public class User {
    private   String name;
    private  String login;
    private  String password;
    private  int bussines;

    public User(String name, String login, String password, int bussines) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.bussines = bussines;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBussines() {
        return bussines;
    }

    public void setBussines(int bussines) {
        this.bussines = bussines;
    }
}
