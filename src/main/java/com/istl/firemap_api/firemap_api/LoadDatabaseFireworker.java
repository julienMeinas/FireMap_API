package com.istl.firemap_api.firemap_api;

import com.istl.firemap_api.firemap_api.bo.*;
import com.istl.firemap_api.firemap_api.controller.fireworker.FireworkerController;
import com.istl.firemap_api.firemap_api.repository.firework.FireworkRepository;
import com.istl.firemap_api.firemap_api.repository.fireworker.FireworkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
class LoadDatabaseFireworker {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabaseFireworker.class);

	@Bean
	CommandLineRunner initDatabaseFireworker(FireworkerController controller) {
		List<Avis> avis1 = new ArrayList<>();
		avis1.add(new Avis(4.6, "Trop bien", "C'était parfait !"));
		List<String> photos1 = new ArrayList<>();

		List<Avis> avis2 = new ArrayList<>();
		avis2.add(new Avis(4.6, "Trop bien", "C'était parfait !"));
		List<String> photos2 = new ArrayList<>();

		List<Avis> avis3 = new ArrayList<>();
		avis3.add(new Avis(4.6, "Trop bien", "C'était parfait !"));
		List<String> photos3 = new ArrayList<>();

		List<Avis> avis4 = new ArrayList<>();
		avis4.add(new Avis(4.6, "Trop bien", "C'était parfait !"));
		List<String> photos4 = new ArrayList<>();

		List<Avis> avis5 = new ArrayList<>();
		avis5.add(new Avis(4.6, "Trop bien", "C'était parfait !"));
		List<String> photos5 = new ArrayList<>();

		return args -> {
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(0, "Aucuns Artificiers", 0, new ArrayList<>(), new ArrayList<>(), "")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(1, "Bob", 4.4, avis1, photos1, "url")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(2, "Benjamin", 4.0, avis1, photos1, "url")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(3, "Julien", 4.5, avis1, photos1, "url")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(4, "Nathalie", 0.5, avis1, photos1, "url")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(5, "Elodie", 4.5, avis1, photos1, "url")));
		};
	}
}
