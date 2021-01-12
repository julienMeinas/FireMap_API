package com.istl.firemap_api.firemap_api.controller.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.QueryParam;

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

	// Aggregate root

	// tag::get-aggregate-root[]
	@GetMapping("/fireworks")
	public List<Firework> getFireworks() {
		return this.service.getFireworks();
	}
	// end::get-aggregate-root[]

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

	@GetMapping("/fireworks/filter")
	public List<Firework> findFireworkByFilter(@QueryParam("note") double note, @QueryParam("crowed") String crowed) {
		return this.service.findFireworkByFilter(note, crowed);
	}
}
