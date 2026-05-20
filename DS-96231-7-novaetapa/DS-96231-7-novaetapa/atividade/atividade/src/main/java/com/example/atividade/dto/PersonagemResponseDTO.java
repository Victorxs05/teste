package com.example.atividade.dto;

public class PersonagemResponseDTO {
    private String nome;
    private String familia;
    private String habilidade;

    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, String familia, String habilidade) {
        this.nome = nome;
        this.familia = familia;
        this.habilidade = habilidade;
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
}
