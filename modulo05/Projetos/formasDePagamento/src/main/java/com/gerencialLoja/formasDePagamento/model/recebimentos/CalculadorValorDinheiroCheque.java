package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;

import java.math.BigDecimal;

public class CalculadorValorDinheiroCheque implements CalcularValorAReceber{


    @Override
    public BigDecimal calcular(RecebimentosModel recebimentosModel) {

        return recebimentosModel.getValorAReceberBruto();
    }
}
