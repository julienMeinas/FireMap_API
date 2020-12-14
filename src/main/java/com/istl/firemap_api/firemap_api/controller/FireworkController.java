package com.istl.firemap_api.firemap_api.controller;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.repository.FireworkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// tag::hateoas-imports[]
// end::hateoas-imports[]

@RestController
public class FireworkController {

	private final FireworkRepository repository;

	public FireworkController(FireworkRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	// tag::get-aggregate-root[]
	@GetMapping("/fireworks")
	public List<Firework> all() {
		return this.repository.findAll();
	}
	// end::get-aggregate-root[]

	@PostMapping("/fireworks")
	public Firework newEmployee(@RequestBody Firework firework) {
		return repository.save(firework);
	}

	// Single item

	// tag::get-single-item[]
	@GetMapping("/fireworks/{id}")
	public Optional<Firework> one(@PathVariable Long id) {
		return this.repository.findById(id);
	}
	// end::get-single-item[]


	@DeleteMapping("/fireworks/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
