package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class FireworkerDetail {
    private @Id long id;
    private String name;
    private String mail;
    private String address;
    private String tel;
    private double note;
    @ElementCollection
    private List<Avis> avis;
    @ElementCollection
    private List<String> images;
    private String urlPage;

    public FireworkerDetail(long id, String name, String mail, String address, String tel, double note, List<Avis> avis, List<String> images, String urlPage) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.tel = tel;
        this.note = note;
        this.avis = avis;
        this.images = images;
        this.urlPage = urlPage;
    }

    public FireworkerDetail() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
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

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(double note) {
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

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setUrlPage(String urlPage) {
        this.urlPage = urlPage;
    }
}
