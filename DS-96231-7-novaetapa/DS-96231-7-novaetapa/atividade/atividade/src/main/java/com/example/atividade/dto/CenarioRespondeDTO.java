package com.example.atividade.dto;

public class CenarioRespondeDTO {
    private String local;
    private String epoca;
    private String perigos;

    public CenarioRespondeDTO() {
    }

    public CenarioRespondeDTO(String local, String epoca, String perigos) {
        this.local = local;
        this.epoca = epoca;
        this.perigos = perigos;
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
}
