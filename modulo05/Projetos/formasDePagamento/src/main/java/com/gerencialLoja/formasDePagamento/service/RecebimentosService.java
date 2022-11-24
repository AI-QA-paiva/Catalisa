package com.gerencialLoja.formasDePagamento.service;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;
import com.gerencialLoja.formasDePagamento.model.recebimentos.CalcularValorAReceber;
import com.gerencialLoja.formasDePagamento.model.recebimentos.ValorAReceberFactory;
import com.gerencialLoja.formasDePagamento.repository.RecebimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecebimentosService {

    @Autowired
    private RecebimentosRepository recebimentosRepository;
    @Autowired
    private ValorAReceberFactory valorAReceberFactory;

    public List<RecebimentosModel> buscarTodosRecebimentos() {
        return recebimentosRepository.findAll();
    }

    public Optional<RecebimentosModel> buscarRecebimentoPorId(Long codigo){
        return recebimentosRepository.findById(codigo);
    }

    public RecebimentosModel cadastrarRecebimento(RecebimentosModel recebimentosModel){
        CalcularValorAReceber calcularValorAReceber = valorAReceberFactory.getCalcularValorAReceber(recebimentosModel.getMetodoPgto());
        recebimentosModel.setValorAReceberLiquido(calcularValorAReceber.calcular(recebimentosModel));
        return recebimentosRepository.save(recebimentosModel);
    }

    public RecebimentosModel alterarRecebimento(RecebimentosModel recebimentosModel){
        CalcularValorAReceber calcularValorAReceber = valorAReceberFactory.getCalcularValorAReceber(recebimentosModel.getMetodoPgto());
        recebimentosModel.setValorAReceberLiquido(calcularValorAReceber.calcular(recebimentosModel));
        return recebimentosRepository.save(recebimentosModel);
    }

    public void deletarRecebimento(Long codigo){
        recebimentosRepository.deleteById(codigo);
    }

}
