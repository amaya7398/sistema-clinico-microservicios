package edu.uady.administrativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uady.administrativo.model.FichaIdentificacion;
import edu.uady.administrativo.service.FichaIdentificacionService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/ficha_identificacion")
public class FichaIdentificacionController {

    @Autowired
    FichaIdentificacionService fichaIdentificacionService;

    @GetMapping
    public FichaIdentificacion getFichaIdentificacion(@RequestParam Integer id) {
        // TODO: finish process GET request
        return fichaIdentificacionService.getFichaIdentificacionById(id);
    }

    @PostMapping
    public FichaIdentificacion createFichaIdentificacion(@RequestBody FichaIdentificacion ficha) {
        // TODO: process POST request
        return ficha;
    }

    @PutMapping(value = "editar/{id}")
    public FichaIdentificacion updateFichaIdentificacion(@PathVariable Integer id,
            @RequestBody FichaIdentificacion ficha) {
        // TODO: process PUT request

        return ficha;
    }
}
