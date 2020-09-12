package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConfigurationProperties(prefix = "book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(){

    }

}
