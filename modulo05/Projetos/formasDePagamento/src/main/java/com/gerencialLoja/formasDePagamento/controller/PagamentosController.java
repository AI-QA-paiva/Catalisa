package com.gerencialLoja.formasDePagamento.controller;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;
import com.gerencialLoja.formasDePagamento.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentosController {

    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping (path = "/pagamento")
    public List<PagamentosModel> buscarValoresPagos(){return pagamentosService.buscarTodosPagamentos();}

    @GetMapping (path = "/pagamento/{codigo}")
    public Optional<PagamentosModel> buscarValorPagoPorId(@PathVariable Long codigo){
        return pagamentosService.buscarPagamentoPorId(codigo);
    }

    @PostMapping(path = "/pagamento")
    public PagamentosModel cadastraPagamento(@RequestBody PagamentosModel pagamentosModel){
        return pagamentosService.cadastrarPagamento(pagamentosModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentosModel alterarPagamento(@RequestBody PagamentosModel pagamentosModel){
        return pagamentosService.alterarPagamento(pagamentosModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo){
        pagamentosService.deletarPagamento(codigo);
    }

}
