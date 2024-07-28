package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "departamentos")
@Data
public class Enfermera extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idEnf;
}
