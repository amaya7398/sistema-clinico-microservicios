package edu.uady.administrativo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ficha_identificacion")
@Data
@NoArgsConstructor
public class FichaIdentificacion {
    @Id
    @Column(name = "num_expediente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numExpediente;

    @CreatedDate
    @Column(name = "fecha_creacion_expediente", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCreacionExpediente;

    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;

    @Column(name = "apellidos", length = 60, nullable = false)
    private String apellidos;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "direccion", length = 60)
    private String direccion;

    @Column(name = "telefono", length = 10, nullable = false)
    private Long telefono;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "estado_civil", length = 20)
    private String estadoCivil;

    @Column(name = "escolaridad", length = 20)
    private String escolaridad;

    @Column(name = "ocupacion", length = 20)
    private String ocupacion;

}
