package com.edward.msHospitalGeneral.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequestDto implements Serializable {
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private LocalDate fechaNacimiento;
    private String genero;
    private Integer edad;
    private String telefono;
}
