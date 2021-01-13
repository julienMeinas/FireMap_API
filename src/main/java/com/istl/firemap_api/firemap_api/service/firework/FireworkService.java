package com.istl.firemap_api.firemap_api.service.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface FireworkService {
    public List<Firework> getFireworks();
    public Firework newFirework( Firework firework);
    public Optional<Firework> geFireworkById( Long id);
    public void deleteFirework( Long id);
    public Optional<Firework> replaceFirework(Long id, int price, boolean accessHandicap, String duration, String crowed);
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, int price, String duration);
}
