package com.tabelasRelacionadas.enderecosCidadesEstados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="endereco")

public class EnderecosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    @Column(name="endereço",nullable = false)
    private String nomeEndereco;

    @Column(name="número",nullable = false)
    private String numeroEndereco;

    @Column(name="bairro",nullable = false)
    private String nomeBairro;

    @Column(name="cep",nullable = false)
    private String numeroCep;


}
