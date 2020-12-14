package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.*;

@Embeddable
public class Parking {
    private long id;
    private String name;
    private double price;

    public Parking() {
    }

    public Parking(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
