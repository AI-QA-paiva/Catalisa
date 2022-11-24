package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;

import java.math.BigDecimal;

public class CalculadorValorCartaoDebito implements CalcularValorAReceber{
    @Override
    public BigDecimal calcular(RecebimentosModel recebimentosModel) {
       BigDecimal taxacao = recebimentosModel.getValorAReceberBruto().multiply(new BigDecimal("0.025"));
       return recebimentosModel.getValorAReceberBruto().subtract(taxacao);
    }
}
