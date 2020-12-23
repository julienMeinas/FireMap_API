package com.istl.firemap_api.firemap_api.controller.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;

import java.util.List;
import java.util.Optional;

public interface FireworkerController {
    public List<FireworkerDetail> getFireworkers();
    public FireworkerDetail newFireworker(FireworkerDetail fireworker);
    public Optional<FireworkerDetail> geFireworkerById(Long id);
    public void deleteFireworker(Long id);
}
