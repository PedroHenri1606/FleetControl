package org.example;

import java.math.BigDecimal;

public class Veiculo {

    private BigDecimal id;
    private ModeloVeiculo modelo;
    private FabricanteVeiculo fabricante;
    private String placa;
    private int ano;
    private CorVeiculo corVeiculo;
    private Long quilometragemAtual;

    public Veiculo() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public ModeloVeiculo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }

    public FabricanteVeiculo getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteVeiculo fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public CorVeiculo getCor() {
        return corVeiculo;
    }

    public void setCor(CorVeiculo corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public CorVeiculo getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(CorVeiculo corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public Long getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(Long quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }
}
