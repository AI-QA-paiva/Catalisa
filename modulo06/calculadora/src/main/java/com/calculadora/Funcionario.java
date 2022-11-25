package com.calculadora;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

}
