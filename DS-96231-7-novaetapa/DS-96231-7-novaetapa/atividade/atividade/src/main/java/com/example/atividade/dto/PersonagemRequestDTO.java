package com.example.atividade.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {
    @NotBlank(message = "O nome é obrigátorio")
    @Size(max = 200, message = "O nome deve ter menos de 200 caracteres")
     private String nome;

    @NotBlank(message = "A familia é obrigatoria")
    @Size(min = 6, message = "A familia deve ter no minimo 6 caracteres")
    @Size(max = 20, message = "A familia deve ter no maximo 12 caracteres")
     private String familia;

    @NotBlank(message = "A habilidade é obrigatoria")
     private String habilidade;

    @NotBlank(message = "A fraqueza do personagem é obrigatoria")
     private String fraqueza;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(String nome, String familia, String habilidade, String fraqueza) {
        this.nome = nome;
        this.familia = familia;
        this.habilidade = habilidade;
        this.fraqueza = fraqueza;
    }

    public @NotBlank(message = "O nome é obrigátorio") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigátorio") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A familia é obrigatoria") @Size(min = 6, message = "A familia deve ter no minimo 6 caracteres") @Size(max = 20, message = "A familia deve ter no maximo 12 caracteres") String getFamilia() {
        return familia;
    }

    public void setFamilia(@NotBlank(message = "A familia é obrigatoria") @Size(min = 6, message = "A familia deve ter no minimo 6 caracteres") @Size(max = 20, message = "A familia deve ter no maximo 12 caracteres") String familia) {
        this.familia = familia;
    }

    public @NotBlank(message = "A habilidade é obrigatoria") String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(@NotBlank(message = "A habilidade é obrigatoria") String habilidade) {
        this.habilidade = habilidade;
    }

    public @NotBlank(message = "A fraqueza do personagem é obrigatoria") String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(@NotBlank(message = "A fraqueza do personagem é obrigatoria") String fraqueza) {
        this.fraqueza = fraqueza;
    }
}
