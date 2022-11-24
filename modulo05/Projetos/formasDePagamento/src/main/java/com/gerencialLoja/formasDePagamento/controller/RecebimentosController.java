package com.gerencialLoja.formasDePagamento.controller;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;
import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;
import com.gerencialLoja.formasDePagamento.service.RecebimentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentosController {

    @Autowired
    private RecebimentosService recebimentosService;

    @GetMapping(path = "/recebimento")
    public List<RecebimentosModel> buscarValoresRecebidos(){
        return recebimentosService.buscarTodosRecebimentos();
    }

    @GetMapping (path = "/recebimento/{codigo}")
    public Optional<RecebimentosModel> buscarValorRecebidoPorId(@PathVariable Long codigo){
        return recebimentosService.buscarRecebimentoPorId(codigo);
    }

    @PostMapping(path = "/recebimento")
    public RecebimentosModel cadastrarRecebimento(@RequestBody RecebimentosModel recebimentosModel){
        return recebimentosService.cadastrarRecebimento(recebimentosModel);
    }

    @PutMapping(path = "/recebimento/{codigo}")
    public RecebimentosModel alterarPagamento(@RequestBody RecebimentosModel recebimentosModel){
        return recebimentosService.alterarRecebimento(recebimentosModel);
    }

    @DeleteMapping(path = "/recebimento/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo){
        recebimentosService.deletarRecebimento(codigo);
    }

}
