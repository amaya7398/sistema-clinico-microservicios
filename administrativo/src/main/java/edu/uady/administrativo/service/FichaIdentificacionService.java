package edu.uady.administrativo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uady.administrativo.model.FichaIdentificacion;
import edu.uady.administrativo.repository.FichaIdentificacionRepository;

@Service
public class FichaIdentificacionService {
    @Autowired
    private FichaIdentificacionRepository fichaIdentRepository;

    // C
    public FichaIdentificacion createFichaIdentificacion(FichaIdentificacion fichaIdentificacion) {
        return fichaIdentRepository.save(fichaIdentificacion);
    }

    // R
    public FichaIdentificacion getFichaIdentificacionById(Integer id) {
        return fichaIdentRepository.findById(id).orElse(null);
    }

    // U
    public FichaIdentificacion updateFichaIdentificacion(FichaIdentificacion ficha_identificacion) {
        return fichaIdentRepository.save(ficha_identificacion);
    }

    // D
    public void deleteFichaIdentificacion(Integer id) {
        fichaIdentRepository.deleteById(id);
    }
}
