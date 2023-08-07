package edu.uady.administrativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uady.administrativo.model.FichaIdentificacion;
import edu.uady.administrativo.service.FichaIdentificacionService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/ficha_identificacion")
public class FichaIdentificacionController {

    @Autowired
    FichaIdentificacionService fichaIdentificacionService;

    @GetMapping
    public ResponseEntity<?> getFichaIdentificacion(@RequestParam Long id) {
        try {
            return new ResponseEntity<>(
                    fichaIdentificacionService.getFichaIdentificacionById(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> createFichaIdentificacion(@RequestBody FichaIdentificacion ficha) {
        try {
            return new ResponseEntity<>(
                    fichaIdentificacionService.createFichaIdentificacion(ficha), HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping()
    public ResponseEntity<?> updateFichaIdentificacion(@RequestBody FichaIdentificacion ficha) {
        try {
            return new ResponseEntity<>(
                    fichaIdentificacionService.updateFichaIdentificacion(ficha), HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
