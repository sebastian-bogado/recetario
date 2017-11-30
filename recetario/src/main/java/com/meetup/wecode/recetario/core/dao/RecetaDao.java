package com.meetup.wecode.recetario.core.dao;

import com.meetup.wecode.recetario.core.model.Receta;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaDao extends BaseBeanDao<Receta> {

    Receta findAllByName(String name);
}
