package com.gerencialLoja.formasDePagamento.repository;

import com.gerencialLoja.formasDePagamento.model.RecebimentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentosRepository extends JpaRepository<RecebimentosModel, Long> {

}
