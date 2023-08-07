package edu.uady.antecedentes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uady.antecedentes.model.AntecedentesPaciente;
import edu.uady.antecedentes.repository.AntecedentesRepository;

@Service
public class AntecedentesService {
    @Autowired
    AntecedentesRepository antecedentesRepository;

    // C
    public AntecedentesPaciente createAntecedentes(AntecedentesPaciente antecedentes) throws Exception {
        Optional<AntecedentesPaciente> existeAntecedentes = antecedentesRepository
                .findByExpedienteId(antecedentes.getExpedienteId());
        if (!existeAntecedentes.isPresent()) {
            return antecedentesRepository.save(antecedentes);
        }
        throw new RuntimeException("ERROR:Existencia | Ya existe hoja de antecedentes");
    }

    // R
    public AntecedentesPaciente getAntecedentes(Long id) throws Exception {
        AntecedentesPaciente antecedentes = antecedentesRepository.findById(id).orElse(null);
        if (antecedentes != null) {
            return antecedentes;
        }
        throw new RuntimeException("ERROR:Existencia | No existe hoja de antecedentes");
    }

    // U
    public AntecedentesPaciente updateAntecedentes(AntecedentesPaciente antecedentes) throws Exception {
        Long id = antecedentes.getId();
        if (id == null) {
            throw new RuntimeException("ERROR:Peticion | No se proporciono ID de ficha");
        }
        AntecedentesPaciente antecedentes2update = antecedentesRepository.findById(id).orElse(null);
        if (antecedentes2update != null) {
            return antecedentesRepository.save(antecedentes);
        }
        throw new RuntimeException("ERROR:Existencia | No existe hoja de antecedentes");
    }

    // D
    public void deleteAntecedentes(Long id) {
        AntecedentesPaciente antecedentes = antecedentesRepository.findById(id).orElse(null);
        if (antecedentes != null) {
            antecedentesRepository.delete(antecedentes);
        } else {
            throw new RuntimeException("ERROR:Existencia | No existe hoja de antecedentes");
        }
    }
}
