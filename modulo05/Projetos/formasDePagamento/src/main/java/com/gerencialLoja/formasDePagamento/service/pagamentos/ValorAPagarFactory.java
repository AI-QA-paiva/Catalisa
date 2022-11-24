package com.gerencialLoja.formasDePagamento.service.pagamentos;

import org.springframework.stereotype.Component;

@Component
public class ValorAPagarFactory {

    public CalcularValorPago getCalcularValorPago(String statusPagamento){
        if(statusPagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")){
            return new CalculadorValorPagoEmAtraso();
        }else if (statusPagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")){
            return new CalculadorValorPagoEmDia();
        }else {
            return null;
        }
    }

}
