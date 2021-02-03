package com.istl.firemap_api.firemap_api.bo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Firework {
    private @Id @GeneratedValue(strategy= GenerationType.AUTO) long id;
    private double longitude;
    private double latitude;
    private String city;
    private String address;
    private Date date;
    @Column(length=1024)
    private String description;
    private int price;
    private boolean handicapAccess;
    private String duration;
    private String crowded;
    private int idFireworker;
    @ElementCollection
    private List<Parking> parking;
    @ElementCollection
    private List<Avis> avis;
    private double note;

    public Firework() {
    }

    public Firework(double longitude, double latitude, String city, String address, Date date, String description, int price, boolean handicapAccess, String duration, String crowded, int idFireworker, List<Parking> parking, List<Avis> avis, double note) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.city = city;
        this.address = address;
        this.date = date;
        this.description = description;
        this.price = price;
        this.handicapAccess = handicapAccess;
        this.duration = duration;
        this.crowded = crowded;
        this.idFireworker = idFireworker;
        this.parking = parking;
        this.avis = avis;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public double getLongitude() { return this.longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude;}

    public double getLatitude() {return this.latitude;}

    public void setLatitude(double latitude) {this.latitude = latitude;}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHandicapAccess() {
        return handicapAccess;
    }

    public void setHandicapAccess(boolean handicAccess) {
        this.handicapAccess = handicAccess;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCrowded() {
        return this.crowded;
    }

    public void setCrowd(String crowded) {
        this.crowded = crowded;
    }

    public int getIdFireworker() {
        return idFireworker;
    }

    public void setIdFireworker(int idFireworker) {
        this.idFireworker = idFireworker;
    }

    public List<Parking> getParking() {
        return parking;
    }

    public void setParking(List<Parking> parking) {
        this.parking = parking;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
