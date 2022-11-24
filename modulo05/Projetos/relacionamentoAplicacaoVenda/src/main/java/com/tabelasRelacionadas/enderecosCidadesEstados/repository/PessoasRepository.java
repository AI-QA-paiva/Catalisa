package com.tabelasRelacionadas.enderecosCidadesEstados.repository;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.PessoasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<PessoasModel, Long> {
}
