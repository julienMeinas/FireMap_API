package com.istl.firemap_api.firemap_api.service;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.repository.FireworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FireworkServiceImpl implements FireworkService {
    private FireworkRepository fireworkRepository;

    public FireworkServiceImpl(FireworkRepository fireworkRepository) {
        this.fireworkRepository = fireworkRepository;
    }


    @Override
    public List<Firework> getFireworks() {
        return this.fireworkRepository.findAll();
    }

    @Override
    public Firework newFirework(Firework firework) {
        return this.fireworkRepository.save(firework);
    }

    @Override
    public Optional<Firework> geFireworkById(Long id) {
        return this.fireworkRepository.findById(id);
    }

    @Override
    public void deleteFirework(Long id) {
        this.fireworkRepository.deleteById(id);
    }

    @Override
    public Optional<Firework> replaceFirework(Firework newFirework, Long id) {
        return this.fireworkRepository.findById(id)
                .map(firework -> {
                    firework.setLongitude(newFirework.getLongitude());
                    firework.setLatitude(newFirework.getLatitude());
                    firework.setAddress(newFirework.getAddress());
                    firework.setDate(newFirework.getDate());
                    firework.setPrice(newFirework.getPrice());
                    firework.setHandicapAccess(newFirework.isHandicapAccess());
                    firework.setDuration(newFirework.getDuration());
                    firework.setFireworker(newFirework.getFireworker());
                    firework.setParking(newFirework.getParking());
                    return this.fireworkRepository.save(firework);
                });
    }
}
