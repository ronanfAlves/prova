package com.curso.service;

import com.curso.domains.dtos.MedicoDTO;
import com.curso.domains.dtos.PacienteDTO;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository medicoRepo;
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteDTO> findAll(){
        return pacienteRepository.findAll().stream()
                .map(PacienteDTO::new)
                .collect(Collectors.toList());


    }
}
