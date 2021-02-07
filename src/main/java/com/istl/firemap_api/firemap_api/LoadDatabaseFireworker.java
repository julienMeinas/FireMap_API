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
		avis1.add(new Avis(4.6, "C'était parfait !"));
		List<String> photos1 = new ArrayList<>();

		List<Avis> avis2 = new ArrayList<>();
		avis2.add(new Avis(4.6, "C'était parfait !"));
		List<String> photos2 = new ArrayList<>();

		List<Avis> avis3 = new ArrayList<>();
		avis3.add(new Avis(4.6, "C'était parfait !"));
		List<String> photos3 = new ArrayList<>();

		List<Avis> avis4 = new ArrayList<>();
		avis4.add(new Avis(4.6, "C'était parfait !"));
		List<String> photos4 = new ArrayList<>();

		List<Avis> avis5 = new ArrayList<>();
		avis5.add(new Avis(4.6, "C'était parfait !"));
		List<String> photos5 = new ArrayList<>();


		List<Avis> emptyAvis = new ArrayList<>();

		return args -> {
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(0, "Aucuns Artificiers", "", "", "", 0, new ArrayList<>(), new ArrayList<>(), "")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(1, "Régie Fête Pyrotechnie", "regiefete.pyrotechnie@wanadoo.fr", "16 Chemin de la Grosse Borne, 62440 Harne", "03 21 20 32 96", 5, avis1, photos1, "https://www.facebook.com/RegieFete")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(2, "Feu d'artifice Brézac artifice, artificier", "contact@brezac.com", "224A Route de la Mallevieille 24130 LE FLEIX France", "05 53 74 45 45", 4.0, avis1, photos1, "http://www.brezac-artifices.com/")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(3, "TOULOUSE ARTIFICES CREATIONS - TAC", "tac.capens@orange.fr", "ZAC de Serres - 15, rue des vieilles vignes - 31410 CAPENS", "05 61 90 34 15", 4.0, avis1, photos1, "http://feux-dartifice.com/")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(4, "Feu d'artifice Hubert Thézé Pyrotechnie : spectacle pyrotechnique et illuminations de rue", "contact@htp.bzh", "Z.A. La Lande Rose 8 rue Blaise Pascal - 35580 GUICHEN", "02 99 52 06 35", 4.0, avis1, photos1, "https://www.htp.bzh/")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(5, "Feu d'artifice Tourcoing, Wagnon artifices", "contact@wagnon-artifices.fr", "203 Rue de l’Alma 59100 Roubaix ", "03.20.70.74.75", 4.0, avis1, photos1, "https://www.wagnon-artifices.fr/")));
			log.info("Preloading " + controller.newFireworker(new FireworkerDetail(6, "Bordeaux Grands Evènements 12 cours du XXX juillet BORDEAUX", "Pas de mail indiqué", "Pas d'adresse indiquée", "05 56 00 66 00", 4.0, emptyAvis, photos1, "Pad d'URL indiquée")));
		};
	}
}
