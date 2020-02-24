package es.openwebiners.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.openwebiners.example.data.ProfesorRepo;
import es.openwebiners.example.model.Profesor;

@Service
public class SimpleProfesorService implements ProfesorService {

	@Autowired
	private ProfesorRepo profesorRepository;

	@Override
	public List<Profesor> getProfesores() {
		return profesorRepository.findAllProfesor();
	}

	@Override
	public Profesor getById(int id) {
		return profesorRepository.findProfesor(id);
	}

}