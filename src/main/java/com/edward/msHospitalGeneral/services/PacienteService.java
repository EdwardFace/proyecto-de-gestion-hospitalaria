package com.edward.msHospitalGeneral.services;

import com.edward.msHospitalGeneral.dto.PacienteRequestDto;
import com.edward.msHospitalGeneral.dto.PacienteResponseDto;

import java.util.List;

public interface PacienteService {
    List<PacienteResponseDto> allPacientes();
    void savePaciente(PacienteRequestDto paciente);
    boolean borrarPaciente(String id);
    boolean updatePaciente(PacienteRequestDto pacienteUpdate);
}
