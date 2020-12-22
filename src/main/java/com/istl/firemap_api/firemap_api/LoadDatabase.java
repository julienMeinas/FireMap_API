package com.istl.firemap_api.firemap_api;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.Fireworker;
import com.istl.firemap_api.firemap_api.bo.Parking;
import com.istl.firemap_api.firemap_api.repository.FireworkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

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

		return args -> {
			log.info("Preloading " + repository.save(new Firework(1.0005, 8.0009, "Lac du héron", new Date(), 0, true, 30, "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(17.0007, 0.0008, "Foire de Lille", new Date(), 0, false, 20, "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(1.0007, 90.0008, "Antwerp centre", new Date(), 5, true, 45, "Medium", fireworker2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(1.0005, 8.0009, "Lac du héron", new Date(), 0, true, 30, "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(17.0007, 0.0008, "Foire de Lille", new Date(), 0, false, 20, "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(1.0007, 90.0008, "Antwerp centre", new Date(), 5, true, 45, "Medium", fireworker2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(1.0005, 8.0009, "Lac du héron", new Date(), 0, true, 30, "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(17.0007, 0.0008, "Foire de Lille", new Date(), 0, false, 20, "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(1.0007, 90.0008, "Antwerp centre", new Date(), 5, true, 45, "Medium", fireworker2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(1.0005, 8.0009, "Lac du héron", new Date(), 0, true, 30, "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(17.0007, 0.0008, "Foire de Lille", new Date(), 0, false, 20, "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(1.0007, 90.0008, "Antwerp centre", new Date(), 5, true, 45, "Medium", fireworker2, parkings2)));
		};
	}
}
