package com.gerencialLoja.formasDePagamento.service.pagamentos;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;

import java.math.BigDecimal;

public interface CalcularValorPago {

    BigDecimal calcular(PagamentosModel pagamentosModel);


}
