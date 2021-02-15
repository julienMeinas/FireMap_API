package com.istl.firemap_api.firemap_api.controller.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.QueryParam;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// tag::hateoas-imports[]
// end::hateoas-imports[]

@RestController
public class FireworkControllerImpl implements FireworkController{
	private final FireworkService service;

	public FireworkControllerImpl(FireworkService service) {
		this.service = service;
	}

	@CrossOrigin()
	@GetMapping("/fireworks")
	public List<Firework> getAllFirework() {
		return this.service.getAllFirework();
	}


	@PostMapping("/fireworks")
	public Firework newFirework(@RequestBody Firework firework) {
		return service.newFirework(firework);
	}


	// tag::get-single-item[]
	@GetMapping("/fireworks/{id}")
	public Optional<Firework> geFireworkById(@PathVariable Long id) {
		return this.service.geFireworkById(id);
	}
	// end::get-single-item[]

	@DeleteMapping("/fireworks/{id}")
	public void deleteFirework(@PathVariable Long id) {
		service.deleteFirework(id);
	}

	@PutMapping("/fireworks/{id}")
	public Optional<Firework> replaceFirework(@PathVariable Long id, @QueryParam("price") int price, @QueryParam("accessHandicap") boolean accessHandicap, @QueryParam("duration") String duration, @QueryParam("crowed") String crowed) {
		return service.replaceFirework(id, price, accessHandicap, duration, crowed);
	}

	@PutMapping("/fireworks/addParking/{id}")
	public Optional<Firework> addParking(@PathVariable("id") Long id, @QueryParam("name") String name, @QueryParam("price") double price) {
		return service.addParkingToFirework(id, name, price);
	}

	@GetMapping("/fireworks/filterByCity")
	public List<Firework> findFireworkByCity(@QueryParam("city") String city) {
		return this.service.findFireworkByCity(city);
	}

	@GetMapping("/fireworks/search/future")
	public List<Firework> getFireworkFutureWithSearch(@QueryParam("city") String city) {
		return this.service.getFireworkFutureWithSearch(city);
	}

	@GetMapping("/fireworks/search")
	public List<Firework> getAllFireworkWithSearch(@QueryParam("city") String city) {
		return this.service.getAllFireworkWithSearch(city);
	}

	@Override
	@PutMapping("/fireworks/addAvis/{id}")
	public Optional<Firework> addAvis(@PathVariable("id") Long id, @QueryParam("note") double note, @QueryParam("comment") String comment) {
		return this.service.addAvis(id, note, comment);
	}

	@GetMapping("/fireworkers/byCity/{id}")
	public List<Firework> getAllFireworkOfFireworkerInCity(@PathVariable("id") int id, @QueryParam("city") String city) {
		return this.service.getAllFireworkOfFireworkerInCity(id, city);
	}

	@GetMapping("/appVersion")
	public String getAppVersion() {
		return this.service.getAppVersion();
	}
}
