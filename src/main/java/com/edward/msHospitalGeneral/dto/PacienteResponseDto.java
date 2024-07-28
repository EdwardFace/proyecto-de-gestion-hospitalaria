package com.edward.msHospitalGeneral.dto;


import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteResponseDto implements Serializable {
    private String idPaciente;
    private LocalDateTime fechaAceptado;
    private String titulo;
    private String nombre;
    private String segundoNombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private LocalDate fechaNacimiento;
    private int edad;
    private String direccion;
    private String telefono;
}
