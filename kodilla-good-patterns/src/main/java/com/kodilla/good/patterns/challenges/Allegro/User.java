package com.kodilla.good.patterns.challenges.Allegro;

public class User {

    private String username;
    private String realName;

    public User(String username, String realName){
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
