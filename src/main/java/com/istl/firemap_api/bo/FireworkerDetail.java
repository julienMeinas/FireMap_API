package com.istl.firemap_api.bo;

import java.util.List;

public class FireworkerDetail {
    private int id;
    private String name;
    private float note;
    private List<Avis> avis;
    private List<String> images;
    private String urlPage;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getNote() {
        return note;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public List<String> getImages() {
        return images;
    }

    public String getUrlPage() {
        return urlPage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void setUrlProfil(String urlPage) {
        this.urlPage = urlPage;
    }
}
