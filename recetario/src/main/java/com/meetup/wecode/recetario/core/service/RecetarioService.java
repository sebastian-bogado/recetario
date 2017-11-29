package com.meetup.wecode.recetario.core.service;

import com.meetup.wecode.recetario.core.dao.RecetarioDao;
import com.meetup.wecode.recetario.core.model.Recetario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetarioService {

    @Autowired
    private RecetarioDao recetarioDao;

    public Optional<Recetario> findRecetarioById(Long id) {
        return recetarioDao.findById(id);
    }

    public Recetario saveRecetario(Recetario recetario) {
        return recetarioDao.save(recetario);
    }

    public void deleteRecetario(Long id) {
        recetarioDao.delete(id);
    }

    public List<Recetario> getRecetarios() {
        return recetarioDao.findAll();
    }
}
