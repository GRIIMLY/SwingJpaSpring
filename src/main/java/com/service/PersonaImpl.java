package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Persona;
import com.repositories.IRepository;

@Service("personaBean")
public class PersonaImpl implements IPersonaService{

	@Autowired
	public IRepository ir;
	
	public List<Persona> findAll() {
		return ir.findAll();
	}

}
