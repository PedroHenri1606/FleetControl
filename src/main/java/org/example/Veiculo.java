package org.example;

public class Veiculo {

    private ModeloCarro modelo;
    private FabricanteCarro fabricante;
    private String placa;
    private int ano;
    private Cor cor;
    private TipoVeiculo tipoVeiculo;

    public Veiculo() {
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

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
