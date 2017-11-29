package com.meetup.wecode.recetario.web.rest.controller;

import com.meetup.wecode.recetario.core.model.Recetario;
import com.meetup.wecode.recetario.core.service.RecetarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/recetario")
@RestController
public class RecetarioController {

    @Autowired
    private RecetarioService recetarioService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Recetario> getRecetarios() {
        return recetarioService.getRecetarios();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recetario saveRecetario(@RequestBody Recetario recetario) {
        return recetarioService.saveRecetario(recetario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRecetario(@PathParam("id")Long id) {
        recetarioService.deleteRecetario(id);
    }
}
