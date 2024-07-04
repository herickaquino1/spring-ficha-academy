package edu.ficha.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ficha.academy.model.ProfessorModel;
import edu.ficha.academy.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepository professor;
	
	public void cadastrarProfessor(ProfessorModel pro) {
		professor.save(pro);
	}
	
	public ProfessorModel retornarProfessor(String nome) {
		return professor.findByNome(nome);
	}
	
	
}
