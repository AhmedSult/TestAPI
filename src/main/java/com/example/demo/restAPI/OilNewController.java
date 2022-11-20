package com.example.demo.restAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.OilNewRepo;
import com.example.demo.model.OilNew;

@RestController
@CrossOrigin(origins = "*")
public class OilNewController {

	@Autowired
	OilNewRepo<OilNew> repo;

	@GetMapping("/new")
	public Iterable<OilNew> getAll() {
		return repo.findAll();
	}

	@PostMapping(value = "/new")
	public void create(@RequestBody OilNew obj) {
		repo.save(obj);
	}
	
}
