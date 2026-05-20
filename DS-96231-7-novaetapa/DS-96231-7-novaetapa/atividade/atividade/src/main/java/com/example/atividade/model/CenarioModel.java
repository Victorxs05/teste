package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cenarios")
public class CenarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String local;
    private String epoca;
    private String perigos;
    private String ano;

    public CenarioModel() {
    }

    public CenarioModel(Long id, String local, String epoca, String perigos, String ano) {
        this.id = id;
        this.local = local;
        this.epoca = epoca;
        this.perigos = perigos;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getPerigos() {
        return perigos;
    }

    public void setPerigos(String perigos) {
        this.perigos = perigos;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
