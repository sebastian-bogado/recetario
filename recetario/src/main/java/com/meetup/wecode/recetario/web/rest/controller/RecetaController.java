package com.meetup.wecode.recetario.web.rest.controller;


import com.meetup.wecode.recetario.core.model.Receta;
import com.meetup.wecode.recetario.core.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receta")
public class RecetaController {
    @Autowired
    private RecetaService recetaService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Receta> findAllRecetarios() {
        return recetaService.findAllRecetas();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Receta saveRecetario(@RequestBody Receta receta) {
        return recetaService.saveReceta(receta);
    }
}
