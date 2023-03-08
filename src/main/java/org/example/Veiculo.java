package org.example;

import java.math.BigDecimal;

public class Veiculo {

    private BigDecimal id;
    private ModeloCarro modelo;
    private FabricanteCarro fabricante;
    private String placa;
    private int ano;
    private CorVeiculo corVeiculo;

    public Veiculo() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCarro modelo) {
        this.modelo = modelo;
    }

    public FabricanteCarro getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteCarro fabricante) {
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

}
