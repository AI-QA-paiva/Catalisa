package com.gerencialLoja.formasDePagamento.service;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;
import com.gerencialLoja.formasDePagamento.repository.PagamentosRepository;
import com.gerencialLoja.formasDePagamento.service.pagamentos.CalcularValorPago;
import com.gerencialLoja.formasDePagamento.service.pagamentos.ValorAPagarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentosService {

    @Autowired
    private PagamentosRepository pagamentosRepository;
    @Autowired
    private ValorAPagarFactory valorAPagarFactory;

    public List<PagamentosModel> buscarTodosPagamentos() {
        return pagamentosRepository.findAll();
    }

    public Optional<PagamentosModel> buscarPagamentoPorId(Long codigo){
        return pagamentosRepository.findById(codigo);
    }

    public PagamentosModel cadastrarPagamento(PagamentosModel pagamentosModel){
        CalcularValorPago calcularValorPago = valorAPagarFactory.getCalcularValorPago(pagamentosModel.getStatus());
        pagamentosModel.setValorPago(calcularValorPago.calcular(pagamentosModel));
        return pagamentosRepository.save(pagamentosModel);
    }

    public PagamentosModel alterarPagamento(PagamentosModel pagamentosModel){
        CalcularValorPago calcularValorPago = valorAPagarFactory.getCalcularValorPago(pagamentosModel.getStatus());
        pagamentosModel.setValorPago(calcularValorPago.calcular(pagamentosModel));
        return pagamentosRepository.save(pagamentosModel);
    }

    public void deletarPagamento(Long codigo){
        pagamentosRepository.deleteById(codigo);
    }

}
