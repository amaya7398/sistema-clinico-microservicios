package edu.uady.administrativo.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

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
    @Column(name = "fecha_creacion_expediente")
    private Date fechaCreacionExpediente;

    @Column(name = "nombre", length = 40)
    private String nombre;

    @Column(name = "apellidos", length = 60)
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "direccion", length = 60)
    private String direccion;

    @Column(name = "telefono", length = 10)
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
