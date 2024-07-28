package com.edward.msHospitalGeneral.models;

import jakarta.persistence.*;
import lombok.Data;

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
}
