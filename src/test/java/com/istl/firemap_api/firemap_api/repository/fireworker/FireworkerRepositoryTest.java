package com.istl.firemap_api.firemap_api.repository.fireworker;

import com.istl.firemap_api.firemap_api.bo.*;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
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
public class FireworkerRepositoryTest {

    @Autowired
    private FireworkerRepository repository;

    @Test
    void FireworkerRepository_shouldExtendsJPARepository() throws NoSuchMethodException {
        assertTrue(JpaRepository.class.isAssignableFrom(FireworkerRepository.class));
    }

    @Test
    void fireworkerRepositoryShouldBeInstanciedBySpring(){
        assertNotNull(repository);
    }

    @Test
    void testSave(){
        List<Avis> avis = new ArrayList<>();
        var fireworker = new FireworkerDetail(0L, "Test Success", "", "", "", 4.6, avis, new ArrayList<String>(), "url");
        repository.save(fireworker);

        var saved = repository.findById(fireworker.getId()).orElse(null);

        assertEquals("Test Success", saved.getName());
    }


}
