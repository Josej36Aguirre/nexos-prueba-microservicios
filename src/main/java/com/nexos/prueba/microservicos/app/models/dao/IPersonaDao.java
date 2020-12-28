package com.nexos.prueba.microservicos.app.models.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.nexos.prueba.microservicos.app.models.entity.Persona;
@Repository
@EnableMongoRepositories
public interface IPersonaDao extends MongoRepository<Persona, Long>{

}
