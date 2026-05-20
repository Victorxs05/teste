package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagens")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String familia;
    private String habilidade;
    private String fraqueza;

    public PersonagemModel() {
    }

    public PersonagemModel(Long id, String nome, String familia, String habilidade, String fraqueza) {
        this.id = id;
        this.nome = nome;
        this.familia = familia;
        this.habilidade = habilidade;
        this.fraqueza = fraqueza;
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

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
}
