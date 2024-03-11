package com.example.apijwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plantacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double latitud;

    private Double longitud;

    @OneToMany(mappedBy = "plantacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sensor> sensores;
}