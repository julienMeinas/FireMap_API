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

		return args -> {
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(1, "Julien", 4.6, avis1, photos1, "url")));
		};
	}
}
