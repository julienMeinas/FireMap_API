package com.istl.firemap_api.firemap_api.service.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface FireworkerService {
    public List<FireworkerDetail> getFireworkers();
    public FireworkerDetail newFireworker( FireworkerDetail fireworker);
    public Optional<FireworkerDetail> geFireworkerById( Long id);
    public void deleteFireworker( Long id);
    public Optional<FireworkerDetail> addAvis(Long id, double note, String title, String comment);
}
