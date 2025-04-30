package br.com.fatecmaua.matematicaAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.com.fatecmaua.matematicaAPI.model.Turma;
import br.com.fatecmaua.matematicaAPI.model.Usuario;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
	List<Turma> findByProfessorId(Long idProfessor);
	List<Usuario> findAlunosById(Long idTurma);
	//"SELECT t FROM Turma t JOIN t.alunos a WHERE a.id = :alunoId"
	Optional<Turma> findTurmaByAlunoId(@Param("alunoId") Long alunoId);
}
