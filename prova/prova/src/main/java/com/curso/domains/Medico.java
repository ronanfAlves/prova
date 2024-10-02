package com.curso.domains;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Medico {
    private long id;
    private String nome;
    private LocalDate DataContratacao;
    private BigDecimal salario;

    public Medico(long id, BigDecimal salario, LocalDate dataContratacao, String nome) {
        this.id = id;
        this.salario = salario;
        this.DataContratacao = dataContratacao;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        DataContratacao = dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
