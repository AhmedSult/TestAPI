package com.example.demo.restAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.OilBaseRepo;
import com.example.demo.model.OilBase;

@RestController
@CrossOrigin(origins = "*")
public class OilBaseController {

	@Autowired
	OilBaseRepo<OilBase> repo;

	@GetMapping("/base")
	public Iterable<OilBase> getAll() {
		return repo.findAll();
	}

	
}
