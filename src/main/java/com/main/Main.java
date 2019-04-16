package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Persona;
import com.service.IPersonaService;
import com.service.PersonaImpl;

public class Main {

	public static void main(String[] args) {
		try {
			
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			IPersonaService p = (IPersonaService) ctx.getBean("personaBean");
			List<Persona> personas = new ArrayList<Persona>();
			personas = p.findAll();
			for (Persona persona : personas) {
				System.out.println(persona.getNombre());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
