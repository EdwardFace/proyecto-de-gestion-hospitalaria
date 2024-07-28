package com.edward.msHospitalGeneral.repository;

import com.edward.msHospitalGeneral.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,String> {
}
