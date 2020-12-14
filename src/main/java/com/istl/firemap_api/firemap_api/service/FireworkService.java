package com.istl.firemap_api.firemap_api.service;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface FireworkService {
    public List<Firework> getFireworks();
    public Firework newFirework( Firework firework);
    public Optional<Firework> geFireworkById( Long id);
    public void deleteFirework( Long id);
}