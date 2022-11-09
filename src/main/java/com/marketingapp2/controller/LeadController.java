package com.marketingapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp2.entities.Lead;
import com.marketingapp2.services.LeadService;
import com.marketingapp2.util.EmailServiceImpl;

@Controller
public class LeadController {
	
	@Autowired
	private EmailServiceImpl email;
	
	@Autowired
	private LeadService leadServices;
	
	@RequestMapping("/viewNewPage")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String saveLead(@ModelAttribute("lead") Lead l , ModelMap model) {
		leadServices.saveOneLead(l);
		email.sendSimpleMail(l.getEmail(),"Text","hello this is vivek");
		model.addAttribute("msg","lead is saved..");
		return "create_lead";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.listAll();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	@RequestMapping("/deleteLead")
	public String deleteLead(@RequestParam("id") long id, ModelMap model) {
		leadServices.deleteLead(id);
		List<Lead> leads = leadServices.listAll();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}
	
	@RequestMapping("/updateLead")
	public String updateLead(@RequestParam("id") long id , ModelMap model) {
		Lead lead = leadServices.updateLead(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	
	@RequestMapping("/updateOneLead")
	public String updateOneLead(@ModelAttribute("lead") Lead l , ModelMap model) {
		leadServices.saveOneLead(l);
		List<Lead> leads = leadServices.listAll();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
}
