package com.nexos.prueba.microservicos.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.microservicos.app.interfaceService.IPersonaService;
import com.nexos.prueba.microservicos.app.models.entity.Persona;

@RestController
@RequestMapping("/nexos")
public class PersonaRestController {

	@Autowired(required = true)
	public IPersonaService personaService;
	
	@GetMapping("/listar")
	public List<Persona> listarPerson(){
		return personaService.findAll();
	}
	
	@PostMapping("/guardar")
	public Boolean savePerson(@RequestBody Persona persona) {
		 personaService.save(persona);
		 return Boolean.TRUE;
	}
	
	@GetMapping("/actualizar/{id}")
	public Persona editPerson(@PathVariable Long id){
		Persona personActually = personaService.findById(id);
	return personaService.updatePerson(personActually);
	}
	@GetMapping("/borrar/{id}")
	public Boolean deletePerson(@PathVariable Long id) {
		personaService.delete(id);
		return Boolean.TRUE;
	}
}
