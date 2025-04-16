package br.com.fatecmaua.matematicaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.matematicaAPI.model.Questao;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {

}
