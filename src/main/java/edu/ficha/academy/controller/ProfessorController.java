package edu.ficha.academy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.ProfessorModel;
import edu.ficha.academy.service.ProfessorService;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	public ProfessorService professor;
	
	@Transactional
	@PostMapping("/cadastrar")
	public void cadastrarProfessores(@RequestBody ProfessorModel prof) {
		professor.cadastrarProfessor(prof);
	}
	
	@GetMapping("/retornar/nome/{nome}")
	public ProfessorModel retornarPorNome(@PathVariable("nome")String nome) {
		return professor.retornarProfessor(nome);
	}
	

}
