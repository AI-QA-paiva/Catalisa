package com.tabelasRelacionadas.enderecosCidadesEstados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="pessoa")

public class PessoasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;

    @Column(name="nome_pessoa",nullable = false)
    private String nomePessoa;

}
