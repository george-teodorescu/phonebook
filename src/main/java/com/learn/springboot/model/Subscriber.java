package com.learn.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscriber {

    private String firstName;
    private String lastName;
    @Id
    private String cnp;
    private String phoneNumber;

    public Subscriber() {
    }

    public Subscriber(String firstName, String lastName, String cnp, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
