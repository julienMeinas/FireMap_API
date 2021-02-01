package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.Embeddable;

@Embeddable
public class Avis {
    private double note;
    private String comment;

    public Avis(double note, String comment) {
        this.note = note;
        this.comment = comment;
    }

    public Avis() {
    }

    public double getNote() {
        return note;
    }

    public String getComment() {
        return comment;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
