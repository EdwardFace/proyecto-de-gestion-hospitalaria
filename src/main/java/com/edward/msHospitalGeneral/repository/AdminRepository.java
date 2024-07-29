package com.edward.msHospitalGeneral.repository;

import com.edward.msHospitalGeneral.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Administrador,String> {
}
