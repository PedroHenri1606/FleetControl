package org.example;

import java.math.BigDecimal;

public class Carga {

    private BigDecimal id;
    private String nomeCarga;

    public Carga() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNomeCarga() {
        return nomeCarga;
    }

    public void setNomeCarga(String nomeCarga) {
        this.nomeCarga = nomeCarga;
    }
}
