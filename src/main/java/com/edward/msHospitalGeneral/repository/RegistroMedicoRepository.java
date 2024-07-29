package com.edward.msHospitalGeneral.repository;


import com.edward.msHospitalGeneral.models.RegistroMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroMedicoRepository extends JpaRepository<RegistroMedico,String> {
}
