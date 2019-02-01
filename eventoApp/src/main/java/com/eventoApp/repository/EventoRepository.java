package com.eventoApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventoApp.Models.Evento;
@Repository                                             // classe ,tipo da variavel Id
public interface EventoRepository extends CrudRepository<Evento,String> {//crudRepository é uma sub classe
	//da super classe repository, onde se faz toda crud no banco de dados, essa interface é rresponsavel pela 
	// injecao de dependencias.
	
	Evento findById(long id);
	
	
	
}
