package com.marketingapp2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp2.entities.Lead;
import com.marketingapp2.repository.LeadRepository;
@RestController
@RequestMapping("/api/lead")
public class LeadRestController {
	@Autowired
	private LeadRepository repo;
	
	@GetMapping
	public List<Lead> allLeads() {
		List<Lead> leads = repo.findAll();
		return leads;
	}
	
	@PostMapping
	public void save(@RequestBody Lead leads) {
		repo.save(leads);
	}
	
	@PutMapping
	public void update(@RequestBody Lead leads) {
		repo.save(leads);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
	
	@RequestMapping("/lead/{id}")
	public Lead getOneId(@PathVariable("id") long id) {
		Optional<Lead> f = repo.findById(id);
		Lead lead = f.get();
		return lead;
	}
	
	
	
	
}
