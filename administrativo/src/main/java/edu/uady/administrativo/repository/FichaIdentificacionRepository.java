package edu.uady.administrativo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uady.administrativo.model.FichaIdentificacion;

public interface FichaIdentificacionRepository extends JpaRepository<FichaIdentificacion, Long> {

    Optional<FichaIdentificacion> findByNombreAndApellidos(String nombre, String apellidos);
}
