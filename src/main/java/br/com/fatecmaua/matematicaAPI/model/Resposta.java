package br.com.fatecmaua.matematicaAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
	    name = "resposta",
	    uniqueConstraints = @UniqueConstraint(columnNames = {"id_aluno", "id_questao"})
	)
public class Resposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_questao")
	private Questao questao;
	@ManyToOne
    @JoinColumn(name = "id_aluno") 
    private Usuario aluno;
	private String alternativa_escolhida;
	private boolean acertou;

	public Resposta() {

	}

	public Resposta(Long id, Questao questao, String alternativa_escolhida, boolean acertou) {
		super();
		this.id = id;
		this.questao = questao;
		this.alternativa_escolhida = alternativa_escolhida;
		this.acertou = acertou;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}
	
	public Usuario getAluno() {
		return aluno;
	}

	public void setAluno(Usuario aluno) {
		this.aluno = aluno;
	}

	public String getAlternativa_escolhida() {
		return alternativa_escolhida;
	}

	public void setAlternativa_escolhida(String alternativa_escolhida) {
		this.alternativa_escolhida = alternativa_escolhida;
	}

	public boolean isAcertou() {
		return acertou;
	}

	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

}
