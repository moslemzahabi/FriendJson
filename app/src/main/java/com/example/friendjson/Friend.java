package com.example.friendjson;

public class Friend {

    private  String name;
    private  String lastname;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
