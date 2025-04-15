package br.com.fatecmaua.matematicaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.matematicaAPI.model.Desempenho;


public interface DesempenhoRepository extends JpaRepository<Desempenho, Long> {

}
