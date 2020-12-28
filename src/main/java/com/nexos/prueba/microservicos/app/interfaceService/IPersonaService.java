package com.nexos.prueba.microservicos.app.interfaceService;

import java.util.List;


import com.nexos.prueba.microservicos.app.models.entity.Persona;


public interface IPersonaService {

	public List<Persona> findAll(); 
	public Persona findById(Long id);
	public Persona save(Persona persona);
	public void delete(Long id);
	public Persona updatePerson(Persona persona);
	
}
