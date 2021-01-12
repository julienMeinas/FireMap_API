package com.istl.firemap_api.firemap_api.service.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
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
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, int price) {
        return this.fireworkRepository.findFireworkByFilter(note, crowed, accessHandicap, price);
    }
}
