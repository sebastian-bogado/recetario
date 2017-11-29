package com.meetup.wecode.recetario.core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Recetario {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "recetario", cascade = CascadeType.ALL)
    private List<Receta> recetas;
}
