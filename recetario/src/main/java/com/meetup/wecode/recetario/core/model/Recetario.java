package com.meetup.wecode.recetario.core.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Recetario extends BaseBean{
    private String name;
    @OneToMany(mappedBy = "recetario", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Receta> recetas;
}
