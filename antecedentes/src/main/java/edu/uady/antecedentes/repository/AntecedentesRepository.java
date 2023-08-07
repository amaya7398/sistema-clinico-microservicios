package edu.uady.antecedentes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uady.antecedentes.model.AntecedentesPaciente;

public interface AntecedentesRepository extends JpaRepository<AntecedentesPaciente, Long> {
    Optional<AntecedentesPaciente> findByExpedienteId(Long expedienteId);
}
