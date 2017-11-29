package com.meetup.wecode.recetario.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Receta {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(length = 2048)
    private String procedimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Recetario recetario;

    @JsonSetter()
    public void setRecetarioId(Long idRecetario){
        recetario = new Recetario();
        recetario.setId(idRecetario);
    }
}
