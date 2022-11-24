package com.gerencialLoja.formasDePagamento.service.pagamentos;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;

import java.math.BigDecimal;

public class CalculadorValorPagoEmAtraso implements CalcularValorPago{

    @Override
    public BigDecimal calcular(PagamentosModel pagamentosModel) {
        return pagamentosModel.getValorAPagar().add(pagamentosModel.getDiferencaValor());
    }


}
