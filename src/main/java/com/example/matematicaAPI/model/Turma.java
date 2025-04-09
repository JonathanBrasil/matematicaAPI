package com.example.matematicaAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String codigo;
    private Integer anoEscolar;

    @ManyToOne
    @JoinColumn(name = "id_professor", nullable = false) // Define a FK para professor
    private Usuario professor; // Referência à entidade Usuario

    public Turma(Long id, String codigo, Integer anoEscolar, Usuario professor) {
        this.id = id;
        this.codigo = codigo;
        this.anoEscolar = anoEscolar;
        this.professor = professor;
    }

    public Turma() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(Integer anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }
}
