package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "enfermeras")
@Data
public class Enfermera extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idEnf;

    @ManyToOne
    @JoinColumn(name = "idDepa",nullable = false)
    private Departamento departamento;
}
