package br.com.fatecmaua.matematicaAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.matematicaAPI.model.Resposta;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
	
	Optional<Resposta> findByAlunoIdAndQuestaoId(Long alunoId, Long questaoId);

}
