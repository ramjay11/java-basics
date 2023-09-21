package com.ramjava.java.basics.serializationanddeserialization;

import java.io.Serializable;

public class Emp implements Serializable {
    public String name;
    public String address;

    public Emp() {
    }

    public Emp(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
