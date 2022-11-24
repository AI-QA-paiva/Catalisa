package com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.repository;


import com.carrinhoprodutos.primeiraVersaoCarrinhoSpring.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {


}
