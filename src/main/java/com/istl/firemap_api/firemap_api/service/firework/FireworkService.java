package com.istl.firemap_api.firemap_api.service.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface FireworkService {
    public List<Firework> getAllFirework();
    public Firework newFirework( Firework firework);
    public Optional<Firework> geFireworkById( Long id);
    public void deleteFirework( Long id);
    public Optional<Firework> replaceFirework(Long id, int price, boolean accessHandicap, String duration, String crowed);
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, double price, String duration);
    public Optional<Firework> addParkingToFirework(Long id, String name,double price);
    public List<Firework> findFireworkByCity(String city);
    public List<Firework> getFireworkFutureWithSearch(String city);
    public List<Firework> getAllFireworkWithSearch(String city);
    public Optional<Firework> addAvis(Long id, double note, String comment);
    public String getAppVersion();
}
