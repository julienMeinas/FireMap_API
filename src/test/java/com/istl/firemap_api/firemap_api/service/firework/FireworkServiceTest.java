package com.istl.firemap_api.firemap_api.service.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FireworkServiceTest {

    @Test
    void getAllfireworks_shouldCallTheRepository() {
        var fireworkRepo = mock(FireworkRepository.class);
        var fireworkService = new FireworkServiceImpl(fireworkRepo);

        fireworkService.getAllFirework();

        verify(fireworkRepo).findAll();
    }

    @Test
    void getFirework_shouldCallTheRepository() {
        var fireworkRepo = mock(FireworkRepository.class);
        var fireworkService = new FireworkServiceImpl(fireworkRepo);

        fireworkService.geFireworkById(1L);

        verify(fireworkRepo).findById(1L);
    }

    @Test
    void createFirework_shouldCallTheRepository() {
        var fireworkRepo = mock(FireworkRepository.class);
        var fireworkService = new FireworkServiceImpl(fireworkRepo);

        var firework = new Firework();
        fireworkService.newFirework(firework);

        verify(fireworkRepo).save(firework);
    }
}
