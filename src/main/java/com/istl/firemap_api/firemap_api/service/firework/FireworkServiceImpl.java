package com.istl.firemap_api.firemap_api.service.firework;

import com.istl.firemap_api.firemap_api.bo.Avis;
import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.bo.Parking;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FireworkServiceImpl implements FireworkService {
    private FireworkRepository fireworkRepository;

    public FireworkServiceImpl(FireworkRepository fireworkRepository) {
        this.fireworkRepository = fireworkRepository;
    }

    public List<Firework> getAllFirework() {
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
    public Optional<Firework> replaceFirework(Long id, int price, boolean accessHandicap, String duration, String crowed) {
        return this.fireworkRepository.findById(id)
                .map(firework -> {  
                    firework.setPrice(price);
                    firework.setHandicapAccess(accessHandicap);
                    firework.setDuration(duration);
                    firework.setCrowd(crowed);
                    return this.fireworkRepository.save(firework);
                });
    }

    @Override
    public Optional<Firework> addParkingToFirework(Long id, String name,double price) {
        return this.fireworkRepository.findById(id)
                .map(firework -> {
                    firework.getParking().add(new Parking(name,price));
                    return this.fireworkRepository.save(firework);
                });
    }

    @Override
    public List<Firework> findFireworkByCity(String city) {
        return this.fireworkRepository.findFireworkByCity(city);
    }

    @Override
    public List<Firework> getFireworkFutureWithSearch(String city) {
        return this.fireworkRepository.getFireworkFutureWithSearch(city);
    }

    @Override
    public List<Firework> getAllFireworkWithSearch(String city) {
        return this.fireworkRepository.getAllFireworkWithSearch(city);
    }

    @Override
    public Optional<Firework> addAvis(Long id, double note, String comment) {
        return this.fireworkRepository.findById(id)
                .map(firework -> {
                    firework.getAvis().add(new Avis(note, comment));
                    if(firework.getNote() == -1) {
                        firework.setNote(note);
                    }else {
                        double noteMoyenne = 0;
                        int cpt = 0;
                        for (Avis a : firework.getAvis()) {
                            cpt += 1;
                            noteMoyenne += a.getNote();
                        }
                        noteMoyenne = noteMoyenne / cpt;
                        firework.setNote(noteMoyenne);
                    }
                    return this.fireworkRepository.save(firework);
                });
    }

    public List<Firework> getAllFireworkOfFireworkerInCity(int id, String city) {
        return this.fireworkRepository.getAllFireworkOfFireworkerInCity(id, city);
    }

    @Value("${appVersion}")
    private String appVersion;
    public String getAppVersion(){
        return appVersion;
    }
}
