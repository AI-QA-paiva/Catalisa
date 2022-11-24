package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;

import java.math.BigDecimal;

public interface CalcularValorAReceber {

    BigDecimal calcular(RecebimentosModel recebimentosModel);
}
