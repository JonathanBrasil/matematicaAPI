package br.com.fatecmaua.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_desempenho", uniqueConstraints = @UniqueConstraint(columnNames = { "id_aluno", "id_turma" }))
public class Desempenho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Usuario aluno;
	@ManyToOne
	@JoinColumn(name = "id_turma")
	private Turma turma;
	private Double pontuacao_final;
	private Double media;
	private Integer atividades_concluidas;
	private String sugestao;

	public Desempenho() {

	}
	
	public Desempenho(int atividadesConcluidas, double pontuacaoFinal, Usuario aluno, Turma turma, String sugestao) {
		this.atividades_concluidas = atividadesConcluidas;
		this.pontuacao_final = pontuacaoFinal;
		this.aluno = aluno;
		this.turma = turma;
		this.sugestao = sugestao;
	}

	public Desempenho(Long id, Usuario aluno, Turma turma, Double pontuacao_final, Integer atividades_concluidas,
			String sugestao, Double media) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.turma = turma;
		this.pontuacao_final = pontuacao_final;
		this.media = media;
		this.atividades_concluidas = atividades_concluidas;
		this.sugestao = sugestao;
	}
	
	public Desempenho(Long id, Usuario aluno, Turma turma, Double pontuacao_final, Double media,
			Integer atividades_concluidas, String sugestao) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.turma = turma;
		this.pontuacao_final = pontuacao_final;
		this.media = media;
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
	
	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
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
