package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movimentacao {

    private BigDecimal id;
    private Carga carga;
    private int quantidade;
    private Cliente cliente;
    private Veiculo veiculo;
    private User user;
    private LocalDateTime horarioDeSaida;
    private LocalDateTime horarioDeChegada;

    public Movimentacao() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getHorarioDeSaida() {
        return horarioDeSaida;
    }

    public void setHorarioDeSaida(LocalDateTime horarioDeSaida) {
        this.horarioDeSaida = horarioDeSaida;
    }

    public LocalDateTime getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public void setHorarioDeChegada(LocalDateTime horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }
}
