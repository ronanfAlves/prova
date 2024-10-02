package com.curso.domains.dtos;

import com.curso.domains.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {

    private long id;

    @NotNull(message = "O campo nome não pode ser nulo!")
    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataInternacao;

    @NotNull(message = "O campo Custo internação não pode ser nulo!")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal custoInternacao;

    public PacienteDTO(Object obj) {
    }

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.dataInternacao = paciente.getDataInternacao();
        this.custoInternacao = paciente.getCustoInternacao();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode ser vazio!") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode ser vazio!") String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(LocalDate dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public @NotNull(message = "O campo salário não pode ser nulo!") @Digits(integer = 15, fraction = 2) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void getcustoInternacao(@NotNull(message = "O campo salário não pode ser nulo!") @Digits(integer = 15, fraction = 2) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }
}