package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "registros_medicos")
@Data
public class RegistroMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idReg;
    private String diagnostico;
    private String[] medicamentos;
    private String tratamiento;

    @ManyToOne
    @JoinColumn(name = "idMed",nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idPaciente",nullable = false)
    private Paciente paciente;
}
