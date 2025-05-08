package br.com.fatecmaua.matematicaAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fatecmaua.matematicaAPI.model.Turma;
import br.com.fatecmaua.matematicaAPI.model.Usuario;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
	List<Turma> findByProfessorId(Long idProfessor);
	
	List<Usuario> findAlunosById(Long idTurma);
	
}
