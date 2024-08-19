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

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RegistroMedico> registrosMedicos;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cita> citas;
}
