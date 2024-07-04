package edu.ficha.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.ficha.academy.model.ProfessorModel;
import jakarta.transaction.Transactional;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Integer> {
		
		public ProfessorModel findByNome(String nome);
		
		@Transactional
		@Modifying
		@Query("delete from ProfessorModel p where p.nome = :nome")
		public void deletarProfessor(@Param("nome") String nome);
		
	
	

}
