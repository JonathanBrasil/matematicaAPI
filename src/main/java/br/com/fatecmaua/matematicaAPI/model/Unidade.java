package br.com.fatecmaua.matematicaAPI.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_unidade_Matematica")
public class Unidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // ID autoincrementado
	private String nome; // NUMEROS, ALGEBRA, GEOMETRIA, GRANDEZAS E MEDIDAS, PROBABILIDADE E ESTATISTICA
	private String descricao;
	@OneToMany(mappedBy = "unidade", cascade = CascadeType.ALL) // Uma unidade tem varias habilidades, excluir uma
																// unidade exclui todas habilidades relacionadas
	@JsonIgnoreProperties("unidade")
	private List<Habilidade> habilidades;
	
	public Unidade() {

	}

	// CLASSE CONSTRUTORA
	public Unidade(Long id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;

	}

	public Unidade(List<Habilidade> habilidades) {
		super();
		this.habilidades = habilidades;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
