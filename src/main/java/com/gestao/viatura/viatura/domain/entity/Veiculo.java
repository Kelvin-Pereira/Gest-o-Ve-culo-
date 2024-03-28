package com.gestao.viatura.viatura.domain.entity;

import com.gestao.viatura.viatura.domain.enums.StatusVeiculoEnum;
import com.gestao.viatura.viatura.domain.enums.TipoCombustivelVeiculoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "VEICULO", schema = "GESTAO")
public class Veiculo {

    @Id
    @Column(name = "ID_VEICULO")
  //  @GeneratedValue(generator = "SEQ_VEICULO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_VEICULO")
    private Long id;

    @Column(name = "ANO", nullable = false)
    private Integer ano;

    @Column(name = "KM", nullable = false)
    private Integer km;

    @Column(name = "PLACA", nullable = false)
    private String placa;

    @Column(name = "STATUS", nullable = false) // Criar convert
    private StatusVeiculoEnum status;

    @Column(name = "TIPO_COMBUSTIVEL", nullable = false) // Criar convert
    private TipoCombustivelVeiculoEnum combustivel;

    @ManyToOne
    @JoinColumn(name = "MODELO_ID", insertable = false, updatable = false)
    private Modelo modelo;

    @Column(name = "DATA_DE_CADASTRO", updatable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "DATA_ULTIMA_ATUALIZACAO", nullable = false)
    private LocalDateTime dataUltimaAtualizacao;

    @PrePersist
    public void prePersist() {
        this.dataCadastro = LocalDateTime.now();
        this.dataUltimaAtualizacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.dataUltimaAtualizacao = LocalDateTime.now();
    }

}
