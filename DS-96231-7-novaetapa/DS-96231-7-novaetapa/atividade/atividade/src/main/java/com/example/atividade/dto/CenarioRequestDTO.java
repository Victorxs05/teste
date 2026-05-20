package com.example.atividade.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {

    @NotBlank(message = "O local é obrigátorio")
    @Size(max = 200, message = "O local deve ter menos de 200 caracteres")
    private String local;

    @NotBlank(message = "A época é obrigátoria")
    @Size(min = 3, message = "A época deve ter no mínimo 3 caracteres")
    @Size(max = 30, message = "A época deve ter no máximo 30 caracteres")
    private String epoca;

    @NotBlank(message = "Os perigos do cenário são obrigátorios")
    private String perigos;

    @NotBlank(message = "O ano é obrigátorio.")
    private String ano;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(String local, String epoca, String perigos, String ano) {
        this.local = local;
        this.epoca = epoca;
        this.perigos = perigos;
        this.ano = ano;
    }

    public @NotBlank(message = "O local é obrigátorio") @Size(max = 200, message = "O local deve ter menos de 200 caracteres") String getLocal() {
        return local;
    }

    public void setLocal(@NotBlank(message = "O local é obrigátorio") @Size(max = 200, message = "O local deve ter menos de 200 caracteres") String local) {
        this.local = local;
    }

    public @NotBlank(message = "A época é obrigátoria") @Size(min = 3, message = "A época deve ter no mínimo 3 caracteres") @Size(max = 30, message = "A época deve ter no máximo 30 caracteres") String getEpoca() {
        return epoca;
    }

    public void setEpoca(@NotBlank(message = "A época é obrigátoria") @Size(min = 3, message = "A época deve ter no mínimo 3 caracteres") @Size(max = 30, message = "A época deve ter no máximo 30 caracteres") String epoca) {
        this.epoca = epoca;
    }

    public @NotBlank(message = "Os perigos do cenário são obrigátorios") String getPerigos() {
        return perigos;
    }

    public void setPerigos(@NotBlank(message = "Os perigos do cenário são obrigátorios") String perigos) {
        this.perigos = perigos;
    }

    public @NotBlank(message = "O ano é obrigátorio.") String getAno() {
        return ano;
    }

    public void setAno(@NotBlank(message = "O ano é obrigátorio.") String ano) {
        this.ano = ano;
    }
}
