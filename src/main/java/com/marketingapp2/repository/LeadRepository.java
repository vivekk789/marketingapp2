package com.marketingapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
