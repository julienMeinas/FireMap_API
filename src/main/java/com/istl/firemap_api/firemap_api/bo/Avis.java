package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.Embeddable;

@Embeddable
public class Avis {
    private double note;
    private String title;
    private String comment;

    public Avis(double note, String title, String comment) {
        this.note = note;
        this.title = title;
        this.comment = comment;
    }

    public Avis() {
    }

    public double getNote() {
        return note;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
