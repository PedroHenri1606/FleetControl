package org.example;

import java.math.BigDecimal;

public class User extends Pessoa {

    private BigDecimal id;
    private String usuario;
    private String senha;
    private CargoUser cargoUser;

    public User() {
    }

    public BigDecimal getId() {
        return id;
    }


    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CargoUser getCargo() {
        return cargoUser;
    }

    public void setCargo(CargoUser cargoUser) {
        this.cargoUser = cargoUser;
    }
}
