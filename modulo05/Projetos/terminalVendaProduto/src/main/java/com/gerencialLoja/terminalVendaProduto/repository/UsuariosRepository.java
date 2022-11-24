package com.gerencialLoja.terminalVendaProduto.repository;


import com.gerencialLoja.terminalVendaProduto.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {


}
