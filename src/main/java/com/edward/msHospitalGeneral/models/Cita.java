package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;



@Entity
@Table(name = "citas")
@Data
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idCita;
    private LocalDate fechaCita;
    private String hora;
    private Estado estado;
}
