package com.meetup.wecode.recetario.web.rest.controller;

import com.meetup.wecode.recetario.core.model.Receta;
import com.meetup.wecode.recetario.core.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/receta")
@RestController
public class RecetaController {

    @Autowired
    private RecetaService recetaService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Receta> getRecetarios() {
        return recetaService.getRecetas();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Receta saveRecetario(@RequestBody Receta receta) {
        return recetaService.saveReceta(receta);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRecetario(@PathParam("id")Long id) {
        recetaService.deleteReceta(id);
    }
}
