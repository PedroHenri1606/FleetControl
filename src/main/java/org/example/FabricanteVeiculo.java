package org.example;

import java.math.BigDecimal;

public class FabricanteVeiculo {

    private BigDecimal id;
    private String nomeFabricante;

    public FabricanteVeiculo() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
}
