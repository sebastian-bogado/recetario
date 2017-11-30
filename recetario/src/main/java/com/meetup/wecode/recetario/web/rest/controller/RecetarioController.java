package com.meetup.wecode.recetario.web.rest.controller;


import com.meetup.wecode.recetario.core.model.Recetario;
import com.meetup.wecode.recetario.core.service.RecetarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recetario")
public class RecetarioController {
    @Autowired
    private RecetarioService recetarioService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Recetario> findAllRecetarios() {
        return recetarioService.findAllRecetarios();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recetario saveRecetario(@RequestBody Recetario recetario) {
        return recetarioService.saveRecetario(recetario);
    }
}
