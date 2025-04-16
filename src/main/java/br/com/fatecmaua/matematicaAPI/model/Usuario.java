package br.com.fatecmaua.matematicaAPI.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private Integer tipo;
	private LocalDate data_criacao;
	
	public Usuario() {

	}

	public Usuario(Long id, String nome, String email, Integer tipo, LocalDate data_criacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.data_criacao = data_criacao;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}
}
