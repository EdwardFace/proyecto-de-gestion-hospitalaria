package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "medicos")
@Data
public class Medico extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idMed;
    private String especializacion;

    @ManyToOne
    @JoinColumn(name = "idDepa",nullable = false)
    private Departamento departamento;

    @OneToMany(mappedBy = "medico")
    private Set<RegistroMedico> registrosMedicos;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;



}
