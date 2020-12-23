package com.istl.firemap_api.firemap_api;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.Fireworker;
import com.istl.firemap_api.firemap_api.bo.Parking;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
class LoadDatabaseFirework {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabaseFirework.class);

	@Bean
	CommandLineRunner initDatabase(FireworkRepository repository) {
		Fireworker fireworker = new Fireworker("Bob", 4.4);
		List<Parking> parkings = new ArrayList<>();
		parkings.add(new Parking("Parking du lac du héron", 0));

		Fireworker fireworker1 = new Fireworker("Benjamin", 4.0);
		List<Parking> parkings1 = new ArrayList<>();
		parkings1.add(new Parking("Parking de la foire de Lille", 11));
		parkings1.add(new Parking("Parking centre de Lille", 15));

		Fireworker fireworker2 = new Fireworker("Julien", 4.5);
		List<Parking> parkings2 = new ArrayList<>();
		parkings2.add(new Parking("Parking de Antwerp centre", 20));

		Fireworker fireworker3 = new Fireworker("Nathalie", 0.5);
		List<Parking> parkings3 = new ArrayList<>();
		parkings3.add(new Parking("Parking de Tourcoing centre", 20));

		Fireworker fireworker4 = new Fireworker("Elodie", 5);
		List<Parking> parkings4 = new ArrayList<>();
		parkings4.add(new Parking("Parking de Mons", 20));

		Fireworker fireworker5 = new Fireworker("Nathalie", 0.5);
		List<Parking> parkings5 = new ArrayList<>();
		parkings5.add(new Parking("Parking de Marseille centre", 40));

		Fireworker fireworker6 = new Fireworker("Elodie", 4.5);
		List<Parking> parkings6 = new ArrayList<>();
		parkings6.add(new Parking("Parking de Paris 7e", 50));

		Fireworker fireworker7 = new Fireworker("François", 0.5);
		List<Parking> parkings7 = new ArrayList<>();
		parkings7.add(new Parking("Parking Roubaix", 40));

		Fireworker fireworker8 = new Fireworker("Laurent", 4.5);
		List<Parking> parkings8 = new ArrayList<>();
		parkings8.add(new Parking("Parking sportpaleis Antwerp", 50));

		return args -> {
			log.info("Preloading " + repository.save(new Firework(1.0005, 8.0009, "Lac du héron", new Date(), 0, true, 30, "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(17.0007, 0.0008, "Foire de Lille", new Date(), 0, false, 20, "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(1.0007, 90.0008, "Antwerp centre", new Date(), 5, true, 45, "Medium", fireworker2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(170.0007, 40.0008, "Tourcoing centre", new Date(), 0, false, 10, "Low", fireworker3, parkings3)));
			log.info("Preloading " + repository.save(new Firework(111.0007, 909.0008, "Mons", new Date(), 5, true, 15, "High", fireworker4, parkings4)));
			log.info("Preloading " + repository.save(new Firework(10.0007, 40.008, "Marseille", new Date(), 0, false, 10, "High", fireworker5, parkings5)));
			log.info("Preloading " + repository.save(new Firework(11.0007, 909.008, "Paris 7e", new Date(), 50, true, 60, "High", fireworker6, parkings6)));
			log.info("Preloading " + repository.save(new Firework(10.0007, 40.008, "Roubaix", new Date(), 0, true, 10, "High", fireworker7, parkings7)));
			log.info("Preloading " + repository.save(new Firework(11.0007, 909.008, "Antwerp sportpaleis", new Date(), 50, true, 60, "High", fireworker8, parkings8)));
		};
	}
}
