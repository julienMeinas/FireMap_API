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
		Date date1 = new Date();
		date1.setMonth(Calendar.DECEMBER);
		date1.setYear(120);

		List<Fireworker> fireworkers1 = new ArrayList<>();
		fireworkers1.add(new Fireworker(2, "Benjamin", 4.0));
		List<Parking> parkings1 = new ArrayList<>();
		parkings1.add(new Parking("Parking de la foire de Lille", 11));
		parkings1.add(new Parking("Parking centre de Lille", 15));
		Date date2 = new Date();
		date2.setMonth(Calendar.NOVEMBER);
		date2.setYear(2022);

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
			log.info("Preloading " + repository.save(new Firework(3.172488, 50.638002, "Villeneuve d'ascq","Lac du héron", date1, "Il veut le mariage du siècle, des petits fours et un feu d'artifice. Elle, des hamburgers, de l'alcool, à la bonne franquette. Tout doit être parfait ! \n" +
					"C'était sans compter l'organisatrice qui veut prendre la place du marié... \n" +
					"Elle va tout faire pour les satisfaire. Enfin... la satisfaire ! \n" +
					"Mais qui attrapera le bouquet ?",0, true, "Middle", "High", 1, parkings)));
			log.info("Preloading " + repository.save(new Firework(3.049432, 50.637137, "Lille", "Foire de Lille", new Date(), "Venez admirer une ville transformée aux couleurs de l'amour, plus de 1 000 ballons en forme de cœur habillent le centre-ville. De nombreuses animations divertiront les amoureux !",0, false, "Middle", "Low", 2, parkings1)));
			log.info("Preloading " + repository.save(new Firework(4.413210, 51.212833, "Antwerp", "Antwerp centre", new Date(), "Daniel découvre que sa femme n'est pas rentrée de la nuit pour la seconde fois... Dès lors qu'il soupçonne son épouse d'entretenir une liaison avec un autre homme, il envisage le divorce et finalement, la prie de s'en aller. Aussitôt Valentine, la première épouse de Daniel, accourt pour le reconquérir. L'intrigue se noue dans un chassé-croisé de malles pour se terminer dans un feu d'artifice de rebondissements !",5, true, "Middle", "Medium", 3, parkings2)));
			log.info("Preloading " + repository.save(new Firework(3.160554, 50.723466, "Tourcoing", "Tourcoing centre", new Date(), "Dégustations, expositions, concerts et feux d'artifice composent le programme de cette grande fête. \n" +
					"\n" +
					"Tous les amoureux du vin, de la gastronomie, de la fête et de la culture sont conviés à partager des moments de liesse et de festivité le long des quais de Garonne : un programme exceptionnel permettant à tous de découvrir la beauté architecturale de la ville, sa richesse culturelle, les vignobles qui l'entourent et les multiples atouts du terroir régional.",0, false, "Short", "Low", 2, parkings3)));
			log.info("Preloading " + repository.save(new Firework(3.118858, 50.645773, "Mons", "Mons", new Date(), "La Ville de Bergheim vous propose un bal champêtre à l'occasion de Fête Nationale française. De nombreuses animations rythmeront la soirée sans oublier le traditionnel feu d'artifice au parking du Jardin de Ville. L'animation est assurée par l'Orchestre Los Festival.",5, true, "Short", "High", 4, parkings4)));
			log.info("Preloading " + repository.save(new Firework(5.372787, 43.295278, "Marseille", "Marseille", new Date(), "Retraite aux flambeaux, ( rassemblement à la mairie vers 22h ), feu d'artifice et bal au champ de foire, à la tombée de la nuit.",0, false, "Short", "High", 5, parkings5)));
			log.info("Preloading " + repository.save(new Firework(2.312310, 48.852617, "Paris", "Paris 7e", new Date(), "Grand feu d'artifice sonorisé. \n" +
					"A 22h30, vous partez de la place du Champ de Foire de St André de Cubzac pour vous rendre au stade Léo Lagrange, au son de la cocarde de St Ciers de Canesse. A 23h00, vous admirez le feu d'artifice.",50, true, "Long", "High", 1, parkings6)));
			log.info("Preloading " + repository.save(new Firework(3.165441, 50.690766, "Roubaix", "Roubaix", new Date(), "Pour la fête Nationale, Quiers-sur-Bezonde organise de nombreuses animations dont \" Tous à vélo \" à 16h, suivi d'un repas et d'un feu d'artifice.",50000, true, "", "", 2, parkings7)));
			log.info("Preloading " + repository.save(new Firework(4.440106, 51.230842, "Antwerp", "Antwerp sportpaleis", new Date(), "Durant deux soirées consécutives en août, les jardins sont illuminés de 2 000 bougies. L'ouverture exceptionnelle en nocturne permet de parcourir les allées de Villandry à la tombée de la nuit et d'admirer les jardins magnifiés par une belle parure de lumière. Au moment où le soleil se couche, les lueurs des 2 000 bougies arrivent à leur apothéose. \n" +
					"Cette soirée onirique s'achève sur un spectaculaire feu d'artifice qui se reflète sur le « miroir d'eau » à 23h00.",50, true, "Long", "High", 2, parkings8)));
		};
	}
}
