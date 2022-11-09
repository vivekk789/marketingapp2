package com.marketingapp2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp2.entities.Lead;
import com.marketingapp2.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
		@Autowired
		private LeadRepository repo;
		
	@Override
	public void saveOneLead(Lead l) {
		repo.save(l);

	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = repo.findAll();
		return leads;
	}

	@Override
	public void deleteLead(long id) {
		repo.deleteById(id);
	}

	@Override
	public Lead updateLead(long id) {
		Optional<Lead> findById = repo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
