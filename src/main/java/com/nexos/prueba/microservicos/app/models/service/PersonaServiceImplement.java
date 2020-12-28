package com.nexos.prueba.microservicos.app.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexos.prueba.microservicos.app.interfaceService.IPersonaService;
import com.nexos.prueba.microservicos.app.models.dao.IPersonaDao;
import com.nexos.prueba.microservicos.app.models.entity.Persona;

@Service
public class PersonaServiceImplement implements IPersonaService{
	
	/**
	 * 	Injector de dependencias por medio de este objeto
	 */
	@Autowired
	private IPersonaDao personaDao; 

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}
	
	@Transactional
	public Persona updatePerson(Persona persona) {
		Persona personaActual = (Persona) findById(persona.getId());
		if (personaActual != null) {
			personaDao.save(personaActual);
		}
		
		return null;
	}
	
	@Override
	public void delete(Long id) {
		personaDao.deleteById(id);
		
	}

	@Override
	public Persona findById(Long id) {
		personaDao.findById(id);
		return null;
	}


	

}
