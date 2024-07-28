package com.edward.msHospitalGeneral.models;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Persona {
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private LocalDate fechaNacimiento;
    private Integer edad;
    private String telefono;
}
