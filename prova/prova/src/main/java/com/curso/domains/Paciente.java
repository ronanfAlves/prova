package com.curso.domains;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Paciente {
    private long id;
    private String nome;
    private LocalDate DataInternacao;
    private BigDecimal custoInternacao;

    public Paciente(long id, String nome, LocalDate dataInternacao, BigDecimal custoInternacao) {
        this.id = id;
        this.DataInternacao = dataInternacao;
        this.custoInternacao = custoInternacao;
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

    public LocalDate getDataInternacao() {
        return DataInternacao;
    }

    public void setDataInternacao(LocalDate dataInternacao) {
        DataInternacao = dataInternacao;
    }

    public BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }
}
