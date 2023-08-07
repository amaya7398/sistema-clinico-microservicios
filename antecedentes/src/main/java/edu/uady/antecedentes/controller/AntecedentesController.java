package edu.uady.antecedentes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uady.antecedentes.model.AntecedentesPaciente;
import edu.uady.antecedentes.service.AntecedentesService;

@RestController
@RequestMapping(value = "/historial")
public class AntecedentesController {
    @Autowired
    AntecedentesService antecedentesService;

    @GetMapping
    public ResponseEntity<?> getAntecedentes(@RequestParam Long id) {
        try {
            return new ResponseEntity<>(antecedentesService.getAntecedentes(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> createAntecedentePaciente(@RequestBody AntecedentesPaciente antecedente) {
        try {
            return new ResponseEntity<>(
                    antecedentesService.createAntecedentes(antecedente), HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> updateAntecedentePaciente(@RequestBody AntecedentesPaciente antecedente) {
        try {
            return new ResponseEntity<>(
                    antecedentesService.updateAntecedentes(antecedente), HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
