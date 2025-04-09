package com.example.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_conteudo")
public class Conteudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private Integer anoEscolar;
	
	public Conteudo(Long id, String titulo, String descricao, Integer anoEscolar) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.anoEscolar = anoEscolar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(Integer anoEscolar) {
		this.anoEscolar = anoEscolar;
	} 
	
	

}
