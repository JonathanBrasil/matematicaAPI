package br.com.fatecmaua.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_questao")
public class Questao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_habilidade")
	private Habilidade habilidade;
	private String enunciado;
	private String alternativa_a;
	private String alternativa_b;
	private String alternativa_c;
	private String alternativa_d;
	private String alternativa_e;
	private String resposta_correta;

	public Questao() {

	}

	public Questao(Long id, Habilidade habilidade, String enunciado, String alternativa_a, String alternativa_b,
			String alternativa_c, String alternativa_d, String alternativa_e, String resposta_correta) {
		super();
		this.id = id;
		this.habilidade = habilidade;
		this.enunciado = enunciado;
		this.alternativa_a = alternativa_a;
		this.alternativa_b = alternativa_b;
		this.alternativa_c = alternativa_c;
		this.alternativa_d = alternativa_d;
		this.alternativa_e = alternativa_e;
		this.resposta_correta = resposta_correta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Habilidade getAtividade() {
		return habilidade;
	}

	public void setAtividade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativa_a() {
		return alternativa_a;
	}

	public void setAlternativa_a(String alternativa_a) {
		this.alternativa_a = alternativa_a;
	}

	public String getAlternativa_b() {
		return alternativa_b;
	}

	public void setAlternativa_b(String alternativa_b) {
		this.alternativa_b = alternativa_b;
	}

	public String getAlternativa_c() {
		return alternativa_c;
	}

	public void setAlternativa_c(String alternativa_c) {
		this.alternativa_c = alternativa_c;
	}

	public String getAlternativa_d() {
		return alternativa_d;
	}

	public void setAlternativa_d(String alternativa_d) {
		this.alternativa_d = alternativa_d;
	}

	public String getAlternativa_e() {
		return alternativa_e;
	}

	public void setAlternativa_e(String alternativa_e) {
		this.alternativa_e = alternativa_e;
	}

	public String getResposta_correta() {
		return resposta_correta;
	}

	public void setResposta_correta(String resposta_correta) {
		this.resposta_correta = resposta_correta;
	}

}
