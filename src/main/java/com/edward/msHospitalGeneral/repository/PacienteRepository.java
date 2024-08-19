package com.edward.msHospitalGeneral.repository;

import com.edward.msHospitalGeneral.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,String> {
    Optional<Paciente> findByTelefono(String telefono);
}
