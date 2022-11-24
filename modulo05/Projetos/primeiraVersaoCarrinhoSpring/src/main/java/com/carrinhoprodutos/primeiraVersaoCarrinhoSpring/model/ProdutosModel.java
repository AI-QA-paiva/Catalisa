package com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")

public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long codigo;
    @Column(length = 50, nullable = false, unique = true)
    private String nome;
    @Column(length = 10, nullable = false)
    private Double valor;


}
