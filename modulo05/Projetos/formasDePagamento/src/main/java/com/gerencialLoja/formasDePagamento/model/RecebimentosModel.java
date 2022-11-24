package com.gerencialLoja.formasDePagamento.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "recebimento")
public class RecebimentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String metodoPgto;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAReceberBruto;

    @Column(length = 50, nullable = false)
    private BigDecimal valorAReceberLiquido;

}
