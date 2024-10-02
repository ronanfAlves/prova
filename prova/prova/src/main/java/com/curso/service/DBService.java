package com.curso.service;


import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;
    private PacienteRepository pacienteRepo;

    public void initDB() {

        // Instanciando médicos
        Medico medico01 = new Medico(1, new BigDecimal("1400.00"), LocalDate.now(), "Paulo");
        Medico medico02 = new Medico(2, new BigDecimal("1400.00"), LocalDate.now(), "João");
        Medico medico03 = new Medico(3, new BigDecimal("1400.00"), LocalDate.now(), "Carlos");

// Instanciando pacientes
        Paciente paciente01 = new Paciente(4, "Julia", LocalDate.now(), new BigDecimal("1400.00"));
        Paciente paciente02 = new Paciente(5, "Mariana", LocalDate.now(), new BigDecimal("1400.00"));
        Paciente paciente03 = new Paciente(6, "Ricardo", LocalDate.now(), new BigDecimal("1400.00"));

// Salvando médicos no repositório
        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);

// Salvando pacientes no repositório
        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        pacienteRepo.save(paciente03);
    }
}
