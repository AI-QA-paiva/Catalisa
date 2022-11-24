package com.tabelasRelacionadas.enderecosCidadesEstados.service;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EnderecosModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.repository.EnderecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecosService {
    @Autowired
    private EnderecosRepository enderecosRepository;

    public EnderecosModel cadastrarEndereco(EnderecosModel endereco){
        return enderecosRepository.save(endereco);
    }

    public List<EnderecosModel> buscarEnderecosTodos(){
        return enderecosRepository.findAll();
    }

    public Optional<EnderecosModel> buscarEnderecoEspecifico(Long idE){
        return enderecosRepository.findById(idE);
    }

    public EnderecosModel alterarEndereco(EnderecosModel endereco){
        return enderecosRepository.save(endereco);
    }

    public void deletarEndereco(Long idEndereco){
        enderecosRepository.deleteById(idEndereco);
    }






}
