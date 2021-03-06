package com.istl.firemap_api.firemap_api.service.fireworker;

import com.istl.firemap_api.firemap_api.bo.Avis;
import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.bo.Parking;
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

    @Override
    public Optional<FireworkerDetail> addAvis(Long id, double note, String comment) {
        return this.fireworkerRepository.findById(id)
                .map(fireworker -> {
                    fireworker.getAvis().add(new Avis(note, comment));
                    if(fireworker.getNote() == -1) {
                        fireworker.setNote(note);
                    }else {

                        double noteMoyenne = 0;
                        int cpt = 0;
                        for (Avis a : fireworker.getAvis()) {
                            cpt += 1;
                            noteMoyenne += a.getNote();
                        }
                        noteMoyenne = noteMoyenne / cpt;
                        fireworker.setNote(noteMoyenne);
                    }
                    return this.fireworkerRepository.save(fireworker);
                });
    }
}
