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

		Fireworker fireworker3 = new Fireworker("Bob", 0.5);
		List<Parking> parkings3 = new ArrayList<>();
		parkings3.add(new Parking("Parking de Tourcoing centre", 20));

		Fireworker fireworker4 = new Fireworker("Bob", 5);
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
		parkings8.add(new Parking("Parking sportpaleis Antwerp", 50)); //

		return args -> {
			log.info("Preloading " + repository.save(new Firework(3.172488, 50.638002, "Lac du héron", new Date(), 0, true, "Middle", "High", fireworker, parkings)));
			log.info("Preloading " + repository.save(new Firework(3.049432, 50.637137, "Foire de Lille", new Date(), 0, false, "Middle", "Low", fireworker1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(4.413210, 51.212833, "Antwerp centre", new Date(), 5, true, "Middle", "Medium", fireworker2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(3.160554, 50.723466, "Tourcoing centre", new Date(), 0, false, "Short", "Low", fireworker3, parkings3)));
			log.info("Preloading " + repository.save(new Firework(3.118858, 50.645773, "Mons", new Date(), 5, true, "Short", "High", fireworker4, parkings4)));
			log.info("Preloading " + repository.save(new Firework(5.372787, 43.295278, "Marseille", new Date(), 0, false, "Short", "High", fireworker5, parkings5)));
			log.info("Preloading " + repository.save(new Firework(2.312310, 48.852617, "Paris 7e", new Date(), 50, true, "Long", "High", fireworker6, parkings6)));
			log.info("Preloading " + repository.save(new Firework(3.165441, 50.690766, "Roubaix", new Date(), 0, true, "", "", fireworker7, parkings7)));
			log.info("Preloading " + repository.save(new Firework(4.440106, 51.230842, "Antwerp sportpaleis", new Date(), 50, true, "Long", "High", fireworker8, parkings8)));
		};
	}
}
