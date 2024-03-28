package com.gestao.viatura.viatura.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "MODELO", schema = "GESTAO")
public class Modelo {

    @Id
    @Column(name = "ID_MODELO")
    //  @GeneratedValue(generator = "SEQ_VEICULO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_MODELO")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "FABRICANTE", nullable = false)
    private String fabricante;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modelo")
    private List<Veiculo> veiculos;

}
