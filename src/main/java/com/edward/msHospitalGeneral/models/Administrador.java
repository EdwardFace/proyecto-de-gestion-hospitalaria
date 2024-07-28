package com.edward.msHospitalGeneral.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "administradores")
@Data
public class Administrador extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idAdmin;
}
