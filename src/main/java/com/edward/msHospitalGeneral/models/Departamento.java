package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "departamentos")
@Data
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idDepa;
    private String nombre;
    private String docEncargado;
    private Integer numCamas;

    @OneToMany(mappedBy = "departamento")
    private Set<Enfermera> enfermeras;

    @OneToMany(mappedBy = "departamento")
    private Set<Administrador> administradors;

    @OneToMany(mappedBy = "departamento")
    private Set<Medico> medicos;
}
