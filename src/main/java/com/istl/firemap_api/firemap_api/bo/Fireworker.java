package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.*;

@Embeddable
public class Fireworker {
    private int id;
    private String name;
    private double note;

    public Fireworker() {
    }

    public Fireworker(int id, String name, double note) {
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
