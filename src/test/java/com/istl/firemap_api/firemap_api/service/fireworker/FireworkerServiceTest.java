package com.istl.firemap_api.firemap_api.service.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import com.istl.firemap_api.firemap_api.repository.fireworker.FireworkerRepository;
import com.istl.firemap_api.firemap_api.service.firework.FireworkServiceImpl;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FireworkerServiceTest {
    @Test
    void getAllfireworkers_shouldCallTheRepository() {
        var fireworkerRepo = mock(FireworkerRepository.class);
        var fireworkerService = new FireworkerServiceImpl(fireworkerRepo);

        fireworkerService.getFireworkers();

        verify(fireworkerRepo).findAll();
    }

    @Test
    void getFireworker_shouldCallTheRepository() {
        var fireworkerRepo = mock(FireworkerRepository.class);
        var fireworkerService = new FireworkerServiceImpl(fireworkerRepo);

        fireworkerService.geFireworkerById(1L);

        verify(fireworkerRepo).findById(1L);
    }

    @Test
    void createFireworker_shouldCallTheRepository() {
        var fireworkerRepo = mock(FireworkerRepository.class);
        var fireworkerService = new FireworkerServiceImpl(fireworkerRepo);

        var fireworker = new FireworkerDetail();
        fireworkerService.newFireworker(fireworker);

        verify(fireworkerRepo).save(fireworker);
    }
}
