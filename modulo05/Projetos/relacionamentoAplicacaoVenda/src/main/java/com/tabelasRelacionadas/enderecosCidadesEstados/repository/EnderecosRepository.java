package com.tabelasRelacionadas.enderecosCidadesEstados.repository;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EnderecosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecosRepository extends JpaRepository<EnderecosModel, Long> {
}
