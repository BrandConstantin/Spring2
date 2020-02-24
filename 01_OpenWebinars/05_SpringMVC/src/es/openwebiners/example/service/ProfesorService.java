package es.openwebiners.example.service;

import java.util.List;

import es.openwebiners.example.model.Profesor;

public interface ProfesorService {

	public List<Profesor> getProfesores();

	public Profesor getById(int id);

}