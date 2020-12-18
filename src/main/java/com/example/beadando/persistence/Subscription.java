package com.example.beadando.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {

    @Id
    private String email;

    @Column
    private String city;

    public Subscription() {
    }

    public Subscription(String email, String city) {
        this.email = email;
        this.city = city;
    }
}
