package org.example;

import java.math.BigDecimal;

public abstract class Pessoa {

    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    private String email;
    private int idade;
    private String datasNascimento;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDatasNascimento() {
        return datasNascimento;
    }

    public void setDatasNascimento(String datasNascimento) {
        this.datasNascimento = datasNascimento;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
