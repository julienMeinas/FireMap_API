package com.istl.firemap_api.firemap_api.controller;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.FireworkService;

import java.util.List;
import java.util.Optional;

public interface FireworkController {
    public List<Firework> getFireworks();
    public Firework newFirework(Firework firework);
    public Optional<Firework> geFireworkById(Long id);
    public void deleteFirework(Long id);
}
