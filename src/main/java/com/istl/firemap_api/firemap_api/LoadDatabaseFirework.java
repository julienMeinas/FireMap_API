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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Configuration
class LoadDatabaseFirework {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabaseFirework.class);

	@Bean
	CommandLineRunner initDatabase(FireworkRepository repository) throws ParseException {
		List<Fireworker> fireworkers = new ArrayList<>();
		fireworkers.add(new Fireworker(1, "Bob", 4.4));
		List<Parking> parkings = new ArrayList<>();
		parkings.add(new Parking("Parking du lac du héron", 0));

		List<Fireworker> fireworkers1 = new ArrayList<>();
		fireworkers1.add(new Fireworker(2, "Benjamin", 4.0));
		List<Parking> parkings1 = new ArrayList<>();
		parkings1.add(new Parking("Parking de la foire de Lille", 11));
		parkings1.add(new Parking("Parking centre de Lille", 15));

		List<Fireworker> fireworkers2 = new ArrayList<>();
		fireworkers2.add(new Fireworker(3, "Julien", 4.5));
		List<Parking> parkings2 = new ArrayList<>();
		parkings2.add(new Parking("Parking de Antwerp centre", 20));

		List<Fireworker> fireworkers3 = new ArrayList<>();
		fireworkers3.add(new Fireworker(1, "Bob", 4.4));
		List<Parking> parkings3 = new ArrayList<>();
		parkings3.add(new Parking("Parking de Tourcoing centre", 20));

		List<Fireworker> fireworkers4 = new ArrayList<>();
		fireworkers4.add(new Fireworker(1, "Bob", 4.4));
		List<Parking> parkings4 = new ArrayList<>();
		parkings4.add(new Parking("Parking de Mons", 20));

		List<Fireworker> fireworkers5 = new ArrayList<>();
		fireworkers5.add(new Fireworker(4, "Nathalie", 0.5));
		List<Parking> parkings5 = new ArrayList<>();
		parkings5.add(new Parking("Parking de Marseille centre", 40));

		List<Fireworker> fireworkers6 = new ArrayList<>();
		fireworkers6.add(new Fireworker(5, "Elodie", 4.5));
		List<Parking> parkings6 = new ArrayList<>();
		parkings6.add(new Parking("Parking de Paris 7e", 50));

		List<Fireworker> fireworkers7 = new ArrayList<>();
		fireworkers7.add(new Fireworker(2, "Benjamin", 4.0));
		List<Parking> parkings7 = new ArrayList<>();
		parkings7.add(new Parking("Parking Roubaix", 40));

		List<Fireworker> fireworkers8 = new ArrayList<>();
		fireworkers8.add(new Fireworker(3, "Julien", 4.5));
		List<Parking> parkings8 = new ArrayList<>();
		parkings8.add(new Parking("Parking sportpaleis Antwerp", 50)); //

		return args -> {
			log.info("Preloading " + repository.save(new Firework(3.172488, 50.638002, "Villeneuve d'ascq","Lac du héron", "14/07/2021", 0, true, "Middle", "High", fireworkers, parkings)));
			log.info("Preloading " + repository.save(new Firework(3.049432, 50.637137, "Lille", "Foire de Lille", "14/07/2021", 0, false, "Middle", "Low", fireworkers1, parkings1)));
			log.info("Preloading " + repository.save(new Firework(4.413210, 51.212833, "Antwerp", "Antwerp centre", "14/07/2021", 5, true, "Middle", "Medium", fireworkers2, parkings2)));
			log.info("Preloading " + repository.save(new Firework(3.160554, 50.723466, "Tourcoing", "Tourcoing centre", "14/07/2021", 0, false, "Short", "Low", fireworkers3, parkings3)));
			log.info("Preloading " + repository.save(new Firework(3.118858, 50.645773, "Mons", "Mons", "14/07/2021", 5, true, "Short", "High", fireworkers4, parkings4)));
			log.info("Preloading " + repository.save(new Firework(5.372787, 43.295278, "Marseille", "Marseille", "14/07/2021", 0, false, "Short", "High", fireworkers5, parkings5)));
			log.info("Preloading " + repository.save(new Firework(2.312310, 48.852617, "Paris", "Paris 7e", "14/07/2021", 50, true, "Long", "High", fireworkers6, parkings6)));
			log.info("Preloading " + repository.save(new Firework(3.165441, 50.690766, "Roubaix", "Roubaix", "14/07/2021", 50000, true, "", "", fireworkers7, parkings7)));
			log.info("Preloading " + repository.save(new Firework(4.440106, 51.230842, "Antwerp", "Antwerp sportpaleis", "14/07/2021", 50, true, "Long", "High", fireworkers8, parkings8)));
		};
	}
}
