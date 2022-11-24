package com.gerencialLoja.terminalVendaProduto.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity
@Table(name = "produtos")

public class ProdutosModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nomeProduto;

    @Column(length = 10, nullable = false)
    private Double valor;

    @Column(name = "porcentagem_desconto",length = 10, nullable = false)
    private Double descontoPorcentagem;

    @Column(name = "valor_do_desconto",length = 10, nullable = false)
    private Double valorDescontoMoeda;

    @Column(name = "cota_Icms",length = 10, nullable = false)
    private Double aliquotaIcms;

    @Column(name = "valor_Icms",length = 10, nullable = false)
    private Double valorIcms;

    @Column(name = "valor_final",length = 10, nullable = false)
    private Double valorFinal;


}
