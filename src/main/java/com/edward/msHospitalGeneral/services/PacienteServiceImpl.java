package com.edward.msHospitalGeneral.services;

import com.edward.msHospitalGeneral.constantes.Constantes;
import com.edward.msHospitalGeneral.dto.PacienteRequestDto;
import com.edward.msHospitalGeneral.dto.PacienteResponseDto;
import com.edward.msHospitalGeneral.exception.ErrorTecnicoExeption;
import com.edward.msHospitalGeneral.models.Paciente;
import com.edward.msHospitalGeneral.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    @Override
    public void savePaciente(PacienteRequestDto paciente) {
        try {
            Paciente pacienteNuevo = mappedToPaciente(paciente);
            pacienteRepository.save(pacienteNuevo);
        }catch (Exception ex){
            throw new ErrorTecnicoExeption(Constantes.CODIGO_ERROR,Constantes.ERROR_TECNICO);
        }

    }

    @Override
    public boolean borrarPaciente(String id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if (paciente.isPresent()){
            pacienteRepository.deleteById(paciente.get().getIdPaciente());
            return true;
        }
        return false;
    }

    @Override
    public boolean updatePaciente(PacienteRequestDto pacienteUpdate) {
        String telefono = pacienteUpdate.getTelefono();
        Optional<Paciente> resultado = pacienteRepository.findByTelefono(telefono);
        if (resultado.isPresent()){
            resultado.get().setNombre(pacienteUpdate.getNombre());
            resultado.get().setEdad(pacienteUpdate.getEdad());
            resultado.get().setApellidoMaterno(pacienteUpdate.getApellidoMaterno());
            resultado.get().setApellidoPaterno(pacienteUpdate.getApellidoPaterno());
            resultado.get().setFechaNacimiento(pacienteUpdate.getFechaNacimiento());
            resultado.get().setTelefono(pacienteUpdate.getTelefono());

            pacienteRepository.save(resultado.get());
            return true;
        }
        return false;

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
    private Paciente mappedToPaciente(PacienteRequestDto pacienteRequestDto){
        return (Paciente) Paciente.builder()
                .nombre(pacienteRequestDto.getNombre())
                .apellidoMaterno(pacienteRequestDto.getApellidoMaterno())
                .apellidoPaterno(pacienteRequestDto.getApellidoPaterno())
                .fechaNacimiento(pacienteRequestDto.getFechaNacimiento())
                .edad(pacienteRequestDto.getEdad())
                .telefono(pacienteRequestDto.getTelefono())
                .build();
    }
}
