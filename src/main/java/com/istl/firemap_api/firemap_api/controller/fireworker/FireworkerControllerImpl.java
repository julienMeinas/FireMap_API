package com.istl.firemap_api.firemap_api.controller.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.service.fireworker.FireworkerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Optional;

// tag::hateoas-imports[]
// end::hateoas-imports[]

@RestController
public class FireworkerControllerImpl implements FireworkerController {
	private final FireworkerService serviceFireworker;

	public FireworkerControllerImpl(FireworkerService service) {
		this.serviceFireworker = service;
	}

	// Aggregate root

	// tag::get-aggregate-root[]
	@GetMapping("/fireworkers")
	public List<FireworkerDetail> getFireworkers() {
		return this.serviceFireworker.getFireworkers();
	}
	// end::get-aggregate-root[]

	@PostMapping("/fireworkers")
	public FireworkerDetail newFireworker(@RequestBody FireworkerDetail fireworker) {
		return serviceFireworker.newFireworker(fireworker);
	}


	// tag::get-single-item[]
	@GetMapping("/fireworkers/{id}")
	public Optional<FireworkerDetail> geFireworkerById(@PathVariable Long id) {
		return this.serviceFireworker.geFireworkerById(id);
	}
	// end::get-single-item[]

	@PutMapping("/fireworkers/addAvis/{id}")
	public Optional<FireworkerDetail> addAvis(@PathVariable("id") Long id, @QueryParam("note") double note, @QueryParam("comment") String comment) {
		return this.serviceFireworker.addAvis(id, note, comment);
	}

	@DeleteMapping("/fireworkers/{id}")
	public void deleteFireworker(@PathVariable Long id) {
		serviceFireworker.deleteFireworker(id);
	}

}
