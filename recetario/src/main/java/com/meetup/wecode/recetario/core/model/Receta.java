package com.meetup.wecode.recetario.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Receta extends BaseBean{
    private String name;
    @Column(length = 2048)
    private String procedimiento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Recetario recetario;

    @JsonSetter
    public void setRecetarioId(Long idRecetario) {
        this.recetario = new Recetario();
        recetario.setId(idRecetario);
    }
}
