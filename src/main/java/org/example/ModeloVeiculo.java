package org.example;

import java.math.BigDecimal;

public class ModeloVeiculo {

    private BigDecimal id;
    private String nomeModelo;
    private FabricanteVeiculo fabricante;
    private TipoVeiculo tipoVeiculo;

    public ModeloVeiculo() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public FabricanteVeiculo getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteVeiculo fabricante) {
        this.fabricante = fabricante;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
