package com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.service;


import com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.model.ProdutosModel;
import com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutosModel> buscarTodos(){
        return produtosRepository.findAll();
    }


    public Optional<ProdutosModel> buscarId (Long codigo){
        return produtosRepository.findById(codigo);

    }

    public ProdutosModel cadastrar(ProdutosModel produtosModel){

        produtosModel.getCodigo();
        produtosModel.getNome();
        produtosModel.getValor();

        return produtosRepository.save(produtosModel);
    }



}
