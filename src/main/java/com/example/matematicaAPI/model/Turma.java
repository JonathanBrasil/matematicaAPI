package com.example.matematicaAPI.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_professor")
	private Usuario professor;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "aluno_turma_tab", 
	joinColumns = @JoinColumn(name = "id_turma"), 
	inverseJoinColumns = @JoinColumn(name = "id_aluno"))
    private List<Usuario> alunos;
	private String codigo;
	private Integer ano_escolar;

	public Turma() {

	}

	public Turma(Long id, Usuario professor, String codigo, Integer ano_escolar) {
		super();
		this.id = id;
		this.professor = professor;
		this.codigo = codigo;
		this.ano_escolar = ano_escolar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getProfessor() {
		return professor;
	}

	public void setProfessor(Usuario professor) {
		this.professor = professor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getAno_escolar() {
		return ano_escolar;
	}

	public void setAno_escolar(Integer ano_escolar) {
		this.ano_escolar = ano_escolar;
	}

}
