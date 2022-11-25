package com.calculadora;


import java.math.BigDecimal;

public class BonificacaoFuncionario {
    public BigDecimal bonusFuncionario(Funcionario funcionario){
        BigDecimal calculoBonus = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        //Bonificação de 10% para caso o calculoBonus der resultado menor que 1000;
        //Se caso der resultado maior que 1000, aplicar ZERO bonus
        if (calculoBonus.compareTo(new BigDecimal("1000"))>0){
            calculoBonus = BigDecimal.ZERO;
        } return calculoBonus;
    }

    public BigDecimal bonusFuncionarioDez(Funcionario funcionario){
        BigDecimal calculoBonusDez = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        //Bonificação de 10% para caso o calculoBonus der resultado maior que 1000, so paga 1000;
        //Se caso der resultado maior que 1000, aplicar ZERO bonus
        if (calculoBonusDez.compareTo(new BigDecimal("800"))<0){
            calculoBonusDez = new BigDecimal(900);
        } return calculoBonusDez;
    }



}
