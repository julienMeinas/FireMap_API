package com.istl.firemap_api.firemap_api.repository.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.Fireworker;
import com.istl.firemap_api.firemap_api.bo.Parking;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class FireworkRepositoryTest {

    @Autowired
    private FireworkRepository repository;

    @Test
    void FireworkRepository_shouldExtendsJPARepository() throws NoSuchMethodException {
        assertTrue(JpaRepository.class.isAssignableFrom(FireworkRepository.class));
    }

    @Test
    void fireworkRepositoryShouldBeInstanciedBySpring(){
        assertNotNull(repository);
    }

    @Test
    void testSave(){
        List<Parking> parkings = new ArrayList<>();
        List<Fireworker> fireworker = new ArrayList<>();
        var firework = new Firework(0, 0, "test Success", new Date(), 0, true, "Long", "Low", fireworker, parkings);
        repository.save(firework);

        var saved = repository.findById(firework.getId()).orElse(null);

        assertEquals("test Success", saved.getAddress());
    }


}
