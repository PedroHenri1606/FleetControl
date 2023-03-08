package org.example;

public class User {

    private String email;
    private String usauario;
    private String senha;
    private Cargo cargo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsauario() {
        return usauario;
    }

    public void setUsauario(String usauario) {
        this.usauario = usauario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
