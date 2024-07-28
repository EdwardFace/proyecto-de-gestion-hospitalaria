package com.edward.msHospitalGeneral.services;

import com.edward.msHospitalGeneral.dto.PacienteResponseDto;
import com.edward.msHospitalGeneral.models.Paciente;
import com.edward.msHospitalGeneral.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteServiceImpl implements PacienteService {


    private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteResponseDto> allPacientes() {
       List<Paciente> pacienteList = pacienteRepository.findAll();
       List<PacienteResponseDto> pacienteResponseDtoList = pacienteList.stream()
               .map(paciente -> mappedToPacienteDto(paciente)).collect(Collectors.toList());
       return pacienteResponseDtoList;
    }

    private PacienteResponseDto mappedToPacienteDto(Paciente paciente){
        return PacienteResponseDto.builder()
                .idPaciente(paciente.getIdPaciente())
                .edad(paciente.getEdad())
                .apellidoMaterno(paciente.getApellidoMaterno())
                .apellidoPaterno(paciente.getApellidoPaterno())
                .fechaNacimiento(paciente.getFechaNacimiento())
                .nombre(paciente.getNombre())
                .telefono(paciente.getTelefono())
                .build();
    }
}
