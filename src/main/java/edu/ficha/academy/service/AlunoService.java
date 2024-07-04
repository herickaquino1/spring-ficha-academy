package edu.ficha.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository aluno;
	
	public void cadastrarAluno(AlunoModel al) {
		aluno.save(al);
	}
	
	public AlunoModel retornarDadosAluno(String nome) {
		return aluno.findByNome(nome);
		
	}
	
}
