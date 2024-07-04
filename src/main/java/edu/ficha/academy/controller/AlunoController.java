package edu.ficha.academy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.service.AlunoService;




@RestController
@RequestMapping("/aluno")
public class AlunoController{
	
	@Autowired
	public AlunoService aluno;
	
	@PostMapping("/cadastrar")
	public void cadastrarAluno(@RequestBody AlunoModel al) {
		aluno.cadastrarAluno(al);
	}
	
	@GetMapping("/retornar/{nome}")
	public AlunoModel retornarAluno(@PathVariable("nome") String nome) {
		
		return aluno.retornarDadosAluno(nome);
	}


	

	
	
	
	 
	
	
	
}
