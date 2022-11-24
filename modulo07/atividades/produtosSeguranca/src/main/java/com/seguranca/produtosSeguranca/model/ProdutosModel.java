package com.seguranca.produtosSeguranca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "produtos")

public class ProdutosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;

    @Column(nullable = false)
    private String nomeProduto;

    @Column(nullable = false)
    private String descricao;



}
