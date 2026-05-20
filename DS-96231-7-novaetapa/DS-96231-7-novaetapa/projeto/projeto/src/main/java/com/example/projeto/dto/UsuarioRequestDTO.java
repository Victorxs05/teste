package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.")
    @Size(max = 100, message = "O nome deve ter no maximo cem caracteres.")
    private String nome;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String senha;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 3, max = 8, message = "A senha deve ter entre 3 e 8 dígitos.")
    private String email;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no maximo cem caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no maximo cem caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 e 8 dígitos.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 e 8 dígitos.") String email) {
        this.email = email;
    }
}
