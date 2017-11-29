package com.meetup.wecode.recetario.core.service;


import com.meetup.wecode.recetario.core.dao.RecetaDao;
import com.meetup.wecode.recetario.core.model.Receta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {

    @Autowired
    private RecetaDao recetaDao;

    public Optional<Receta> findRecetaById(Long id) {
        return recetaDao.findById(id);
    }

    public List<Receta> findRecetasByName(String name) {
        return recetaDao.findAllByName(name);
    }

    public Receta saveReceta(Receta receta) {
        return recetaDao.save(receta);
    }

    public void deleteReceta(Long id) {
        recetaDao.delete(id);
    }

    public List<Receta> getRecetas() {
        return recetaDao.findAll();
    }
}
