package com.steedup.qa.models;

public class Data {

    private String user;
    private String password;

    public Data(String user, String password){
        this.user=user;
        this.password=password;
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
