package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;

import java.math.BigDecimal;

public class CalculadorValorCartaoCredito implements CalcularValorAReceber{
    @Override
    public BigDecimal calcular(RecebimentosModel recebimentosModel) {
        BigDecimal taxacao = recebimentosModel.getValorAReceberBruto().multiply(new BigDecimal("0.037"));
        return recebimentosModel.getValorAReceberBruto().subtract(taxacao);
    }
}
