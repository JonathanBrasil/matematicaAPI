package com.example.matematicaAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_habilidades")
public class Habilidade {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; //ID autoincrementado
		private Integer anoEscolar;
		private String sigla; //Exemplo EF06MA17 -- Ensino Fundamental, ANO 06, Matematica, HABILIDADE 17
		@Column(columnDefinition = "TEXT")
		private String descricao;
		private String objetoConhecimento;
		private Integer bimestre;
		@ManyToOne
		@JsonIgnoreProperties("habilidades")
	    @JoinColumn(name = "id_unidade", nullable = false) // Define a FK para a unidade (Numero, Algebra, Geometria, Grandeza, Probabilidade)
	    private Unidade unidade; // Referência à entidade Unidade
	
		public Habilidade(Long id, String sigla, String descricao, String objetoConhecimento, Integer bimestre,
				Unidade id_unidade, Integer anoEscolar) {
			super();
			this.id = id;
			this.anoEscolar = anoEscolar;
			this.sigla = sigla;
			this.descricao = descricao;
			this.objetoConhecimento = objetoConhecimento;
			this.bimestre = bimestre;
			this.unidade = id_unidade;
		}

		//GETTERS AND SETTERS DE HABIIDADES
		public Long getId() {
			return id;
		}
		
		public Integer getAnoEscolar() {
			return anoEscolar;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSigla() {
			return sigla;
		}

		public void setSigla(String sigla) {
			this.sigla = sigla;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getObjetoConhecimento() {
			return objetoConhecimento;
		}

		public void setObjetoConhecimento(String objetoConhecimento) {
			this.objetoConhecimento = objetoConhecimento;
		}

		public Integer getBimestre() {
			return bimestre;
		}

		public void setBimestre(Integer bimestre) {
			this.bimestre = bimestre;
		}

		public Unidade getId_unidade() {
			return unidade;
		}

		public void setId_unidade(Unidade id_unidade) {
			this.unidade = id_unidade;
		}
		
		
	}
