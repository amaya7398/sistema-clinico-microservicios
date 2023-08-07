package edu.uady.administrativo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uady.administrativo.model.FichaIdentificacion;
import edu.uady.administrativo.repository.FichaIdentificacionRepository;

@Service
public class FichaIdentificacionService {
    @Autowired
    private FichaIdentificacionRepository fichaIdentRepository;

    // C
    public FichaIdentificacion createFichaIdentificacion(FichaIdentificacion fichaIdentificacion) throws Exception {
        Optional<FichaIdentificacion> existeFicha = fichaIdentRepository.findByNombreAndApellidos(
                fichaIdentificacion.getNombre(), fichaIdentificacion.getApellidos());
        if (!existeFicha.isPresent()) {
            return fichaIdentRepository.save(fichaIdentificacion);
        }
        throw new RuntimeException("ERROR:Existencia | Ya existe una ficha de identificacion");
    }

    // R
    public FichaIdentificacion getFichaIdentificacionById(Long id) throws Exception {
        FichaIdentificacion ficha = fichaIdentRepository.findById(id).orElse(null);
        if (ficha != null) {
            return ficha;
        }
        throw new RuntimeException("ERROR:Existencia | No existe ficha con id: " + id);
    }

    // U
    public FichaIdentificacion updateFichaIdentificacion(FichaIdentificacion ficha_identificacion) throws Exception {
        Long fichaId = ficha_identificacion.getNumExpediente();
        if (fichaId == null) {
            throw new RuntimeException("ERROR:Peticion | No se proporciono ID de ficha");
        }
        FichaIdentificacion ficha2update = fichaIdentRepository.findById(fichaId).orElse(null);
        if (ficha2update != null) {
            return fichaIdentRepository.save(ficha_identificacion);
        }
        throw new RuntimeException("ERROR:Existencia | No existe ficha con id: " + fichaId);
    }

    // D
    public void deleteFichaIdentificacion(Long id) {
        fichaIdentRepository.deleteById(id);
    }
}
