package com.marketingapp2.services;

import java.util.List;

import com.marketingapp2.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead l);

	public List<Lead> listAll();

	public void deleteLead(long id);

	public Lead updateLead(long id);
	
}
