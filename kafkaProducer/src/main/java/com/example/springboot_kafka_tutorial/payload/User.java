package com.example.springboot_kafka_tutorial.payload;

import lombok.Data;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
