package com.gerencialLoja.terminalVendaProduto.repository;

import com.gerencialLoja.terminalVendaProduto.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}
