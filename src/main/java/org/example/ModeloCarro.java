package org.example;

import java.math.BigDecimal;

public class ModeloCarro {

    private BigDecimal id;
    private String nomeModelo;
    private FabricanteCarro fabricante;
    private TipoVeiculo tipoVeiculo;

    public ModeloCarro() {
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

    public FabricanteCarro getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteCarro fabricante) {
        this.fabricante = fabricante;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
