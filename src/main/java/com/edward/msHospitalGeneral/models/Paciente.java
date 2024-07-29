package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "pacientes")
@Data
public class Paciente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idPaciente;

    @OneToMany(mappedBy = "paciente")
    private List<RegistroMedico> registrosMedicos;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;
}
