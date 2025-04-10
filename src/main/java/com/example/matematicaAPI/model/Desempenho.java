package com.example.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_desempenho")
public class Desempenho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "id_aluno")
	private Usuario aluno;
	@OneToOne
	@JoinColumn(name = "id_turma")
	private Turma turma;
	private Double pontuacao_final;
	private Integer atividades_concluidas;
	private String sugestao;

	public Desempenho() {

	}

	public Desempenho(Long id, Usuario aluno, Turma turma, Double pontuacao_final, Integer atividades_concluidas,
			String sugestao) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.turma = turma;
		this.pontuacao_final = pontuacao_final;
		this.atividades_concluidas = atividades_concluidas;
		this.sugestao = sugestao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getAluno() {
		return aluno;
	}

	public void setAluno(Usuario aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Double getPontuacao_final() {
		return pontuacao_final;
	}

	public void setPontuacao_final(Double pontuacao_final) {
		this.pontuacao_final = pontuacao_final;
	}

	public Integer getAtividades_concluidas() {
		return atividades_concluidas;
	}

	public void setAtividades_concluidas(Integer atividades_concluidas) {
		this.atividades_concluidas = atividades_concluidas;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

}
