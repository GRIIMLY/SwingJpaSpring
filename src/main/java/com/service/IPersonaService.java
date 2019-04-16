package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Persona;

public interface IPersonaService{
	
	List<Persona> findAll();
}
