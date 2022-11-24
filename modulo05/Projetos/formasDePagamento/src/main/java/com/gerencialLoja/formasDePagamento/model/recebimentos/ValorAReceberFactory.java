package com.gerencialLoja.formasDePagamento.model.recebimentos;

import com.gerencialLoja.formasDePagamento.service.pagamentos.CalculadorValorPagoEmAtraso;
import com.gerencialLoja.formasDePagamento.service.pagamentos.CalculadorValorPagoEmDia;
import com.gerencialLoja.formasDePagamento.service.pagamentos.CalcularValorPago;
import org.springframework.stereotype.Component;

@Component
public class ValorAReceberFactory {

    public CalcularValorAReceber getCalcularValorAReceber(String statusMetodoPagamento){
        if(statusMetodoPagamento.equalsIgnoreCase("PIX_CHEQUE")){
            return new CalculadorValorDinheiroCheque();
        }else if(statusMetodoPagamento.equalsIgnoreCase("CARTAO_DEBITO")){
            return new CalculadorValorCartaoDebito();
        }else if (statusMetodoPagamento.equalsIgnoreCase("CARTAO_CREDITO")){
            return new CalculadorValorCartaoCredito();
        }else if(statusMetodoPagamento.equalsIgnoreCase("VALE_REFEICAO")){
            return new CalculadorValorValeRefeicao();
        }else {
            return null;
        }
    }
}
