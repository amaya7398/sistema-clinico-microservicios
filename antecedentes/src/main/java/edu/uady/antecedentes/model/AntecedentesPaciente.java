package edu.uady.antecedentes.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "antecedentes_paciente")
@Data
@NoArgsConstructor
public class AntecedentesPaciente {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "expediente_id", length = 30, nullable = false)
    private Long expedienteId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_creado", nullable = false)
    private LocalDate fechaCreado;

    // Mapeo de la relacion uno a uno con la tabla antec_heredo_fam
    // Implementando con llave primaria compartida
    @OneToOne(mappedBy = "antecedentesPaciente", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AntecHeredoFam antecHeredoFam;
}
