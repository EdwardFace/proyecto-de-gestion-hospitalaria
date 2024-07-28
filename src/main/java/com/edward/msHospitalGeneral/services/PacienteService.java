package com.edward.msHospitalGeneral.services;

import com.edward.msHospitalGeneral.dto.PacienteResponseDto;

import java.util.List;

public interface PacienteService {
    List<PacienteResponseDto> allPacientes();
}
