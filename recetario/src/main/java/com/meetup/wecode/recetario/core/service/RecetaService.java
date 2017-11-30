package com.meetup.wecode.recetario.core.service;

import com.meetup.wecode.recetario.core.dao.RecetaDao;
import com.meetup.wecode.recetario.core.model.Receta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaService {

    @Autowired
    private RecetaDao recetaDao;


    public List<Receta> findAllRecetas() {
        return recetaDao.findAll();
    }

    public Receta findRecetaById(Long id) {
        return recetaDao.findById(id).get();
    }

    public Receta saveReceta(Receta receta) {
        return recetaDao.save(receta);
    }

    public void deleteReceta(Long id) {
        recetaDao.delete(id);
    }
}
