package com.tabelasRelacionadas.enderecosCidadesEstados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="estado")

public class EstadosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;

    @Column(name="nome_estado",nullable = false)
    private String nomeEstado;

    @Column(name="uf",nullable = false)
    private String siglaEstado;

}
