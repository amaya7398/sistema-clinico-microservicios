package edu.uady.antecedentes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "antec_heredo_fam")
@Data
@NoArgsConstructor
public class AntecHeredoFam {
    @Id
    @Column(name = "antecedente_id")
    private Long id;
    // @GeneratedValue(strategy = GenerationType.AUTO)

    @OneToOne
    @MapsId
    @JoinColumn(name = "antecedente_id")
    private AntecedentesPaciente antecedentesPaciente;

    @Column(name = "cardiopatias")
    private String cardiopatias;

    @Column(name = "alergias")
    private String alergias;

    @Column(name = "diabetes")
    private String diabetes;

    @Column(name = "nefropatias")
    private String nefropatias;

    @Column(name = "psiquiatricos")
    private String psiquiatricos;

    @Column(name = "neurologicas")
    private String neurologicas;

    @Column(name = "otros")
    private String otros;
}
