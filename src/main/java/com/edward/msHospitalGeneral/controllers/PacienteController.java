package com.edward.msHospitalGeneral.controllers;

import com.edward.msHospitalGeneral.dto.PacienteResponseDto;
import com.edward.msHospitalGeneral.services.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/pacientes")
public class PacienteController {

    @Autowired
    private PacienteServiceImpl pacienteService;

    @GetMapping(name = "/all")
    private ResponseEntity<List<PacienteResponseDto>> obtenerPacientes(){
        return ResponseEntity.ok(pacienteService.allPacientes());
    }

}
