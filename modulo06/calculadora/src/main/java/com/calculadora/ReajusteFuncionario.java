package com.calculadora;

import java.math.BigDecimal;

public class ReajusteFuncionario {

    public void concederReajuste(Funcionario funcionario, DesempenhoFuncionario desempenhoFuncionario){

        if(desempenhoFuncionario == DesempenhoFuncionario.A_DESEJAR){
            BigDecimal valorAdd = funcionario.getSalario().multiply(new BigDecimal(0.03));

            BigDecimal valorReajustado = funcionario.getSalario().add(valorAdd);
            funcionario.setSalario(valorReajustado);
        }



    }

}
