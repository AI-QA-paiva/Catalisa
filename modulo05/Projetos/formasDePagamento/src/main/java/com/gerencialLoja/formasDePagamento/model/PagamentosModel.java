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
@Table(name = "pagamento")
public class PagamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;

    @Column(length = 10, nullable = false)
    private BigDecimal valorPago;

}
