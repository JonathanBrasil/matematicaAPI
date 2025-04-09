package com.example.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private Integer dificuldade; //1 para facil, 2 medio,  3 dificil
	
	@ManyToOne
    @JoinColumn(name = "id_conteudo", nullable = false) // Define a FK
    private Conteudo id_conteudo; // Referência à entidade Conteudo

	public Atividade(Long id, String titulo, String descricao, Integer dificuldade, Conteudo id_conteudo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dificuldade = dificuldade;
		this.id_conteudo = id_conteudo;
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

	public Integer getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}

	public Conteudo getId_conteudo() {
		return id_conteudo;
	}

	public void setId_conteudo(Conteudo id_conteudo) {
		this.id_conteudo = id_conteudo;
	}

	
}
