package com.gerencialLoja.formasDePagamento.repository;

import com.gerencialLoja.formasDePagamento.model.PagamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentosRepository extends JpaRepository<PagamentosModel, Long> {

}
