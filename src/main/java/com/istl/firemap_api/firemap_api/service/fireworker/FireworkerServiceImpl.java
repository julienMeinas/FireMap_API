package com.istl.firemap_api.firemap_api.service.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import com.istl.firemap_api.firemap_api.repository.fireworker.FireworkerRepository;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FireworkerServiceImpl implements FireworkerService {
    private FireworkerRepository fireworkerRepository;

    public FireworkerServiceImpl(FireworkerRepository fireworkerRepository) {
        this.fireworkerRepository = fireworkerRepository;
    }


    @Override
    public List<FireworkerDetail> getFireworkers() {
        return this.fireworkerRepository.findAll();
    }

    @Override
    public FireworkerDetail newFireworker(FireworkerDetail fireworker) {
        return this.fireworkerRepository.save(fireworker);
    }

    @Override
    public Optional<FireworkerDetail> geFireworkerById(Long id) {
        return this.fireworkerRepository.findById(id);
    }

    @Override
    public void deleteFireworker(Long id) {
        this.fireworkerRepository.deleteById(id);
    }
}
