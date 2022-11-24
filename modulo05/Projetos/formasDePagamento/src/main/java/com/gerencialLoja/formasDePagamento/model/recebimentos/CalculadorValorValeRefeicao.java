package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;

import java.math.BigDecimal;

public class CalculadorValorValeRefeicao implements CalcularValorAReceber{
    @Override
    public BigDecimal calcular(RecebimentosModel recebimentosModel) {
        BigDecimal taxacao = recebimentosModel.getValorAReceberBruto().multiply(new BigDecimal("0.042"));
        return recebimentosModel.getValorAReceberBruto().subtract(taxacao);
    }
}
