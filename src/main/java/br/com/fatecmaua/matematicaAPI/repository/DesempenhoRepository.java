package br.com.fatecmaua.matematicaAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.matematicaAPI.model.Desempenho;

public interface DesempenhoRepository extends JpaRepository<Desempenho, Long> {

	Optional<Desempenho> findByAlunoIdAndTurmaId(Long alunoId, Long turmaId);
	
}
