package com.edward.msHospitalGeneral.repository;


import com.edward.msHospitalGeneral.models.Enfermera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeraRepository extends JpaRepository<Enfermera,String> {
}
