package com.istl.firemap_api.firemap_api.controller;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.FireworkService;
import org.springframework.web.bind.annotation.*;

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
	public Optional<Firework> replaceFirework(@RequestBody Firework newFirework, @PathVariable Long id) {
		return service.replaceFirework(newFirework, id);
	}
}
