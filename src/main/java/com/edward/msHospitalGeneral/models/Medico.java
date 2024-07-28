package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "medicos")
@Data
public class Medico extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idMed;
    private String especializacion;
}
