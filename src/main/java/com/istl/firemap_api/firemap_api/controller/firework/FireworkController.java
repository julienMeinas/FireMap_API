package com.istl.firemap_api.firemap_api.controller.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Optional;

public interface FireworkController {
    public List<Firework> getFireworks();
    public Firework newFirework(Firework firework);
    public Optional<Firework> geFireworkById(Long id);
    public void deleteFirework(Long id);
    public Optional<Firework> replaceFirework(Long id, int price, boolean accessHandicap, String duration, String crowed);
    public Optional<Firework> addParking(Long id, String name, double price);
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, double price, String duration);
    public List<Firework> findFireworkByCity(String city);
}
