package com.istl.firemap_api.firemap_api.repository.firework;

import com.istl.firemap_api.firemap_api.bo.Avis;
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
        List<Avis> avis1 = new ArrayList<>();
        var firework = new Firework(0, 0, "city", "test Success", new Date(), "",0, true, "Long", "Low", 1, parkings, avis1, 0);
        repository.save(firework);

        var saved = repository.findById(firework.getId()).orElse(null);

        assertEquals("test Success", saved.getAddress());
    }


    @Test
    void findFireworkByCityTest() {
        List<Parking> parkings = new ArrayList<>();
        List<Fireworker> fireworker = new ArrayList<>();
        List<Avis> avis1 = new ArrayList<>();
        var firework = new Firework(0, 0, "city", "test Success", new Date(), "",0, true, "Long", "Low", 1, parkings, avis1, 0);
        repository.save(firework);

        var fireworkByCity = repository.findFireworkByCity("city");

        assertEquals(fireworkByCity.size(), 1);

        assertEquals("test Success", fireworkByCity.get(0).getAddress());
    }


    @Test
    void searchTest() {
        List<Parking> parkings = new ArrayList<>();
        List<Fireworker> fireworker = new ArrayList<>();
        List<Avis> avis1 = new ArrayList<>();
        Date dateBefore = new Date();
        dateBefore.setYear(dateBefore.getYear()-1);
        Date dateAfter = new Date();
        dateAfter.setYear(dateAfter.getYear()+1);
        var fireworkAfter = new Firework(0, 0, "city", "test Success After", dateAfter, "",0, true, "Long", "Low", 1, parkings, avis1, 0);
        var fireworkBeforeAndAfter = new Firework(0, 0, "city", "test Success Before", dateBefore, "",0, true, "Long", "Low", 1, parkings, avis1, 0);
        repository.save(fireworkAfter);
        repository.save(fireworkBeforeAndAfter);


        var savedFireworkBeforeAndAfterInCity = repository.getAllFireworkWithSearch("city");
        var savedFireworkAfterInCity = repository.getFireworkFutureWithSearch("city");

        assertEquals(savedFireworkBeforeAndAfterInCity.size(), 2);
        assertEquals("test Success Before", savedFireworkBeforeAndAfterInCity.get(0).getAddress());
        assertEquals("test Success After", savedFireworkBeforeAndAfterInCity.get(1).getAddress());


        assertEquals(savedFireworkAfterInCity.size(), 1);
        assertEquals("test Success After", savedFireworkAfterInCity.get(0).getAddress());

    }


}
