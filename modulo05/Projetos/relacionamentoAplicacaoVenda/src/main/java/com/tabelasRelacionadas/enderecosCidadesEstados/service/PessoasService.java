package com.tabelasRelacionadas.enderecosCidadesEstados.service;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.PessoasModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.repository.PessoasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoasService {
    @Autowired
    private PessoasRepository pessoasRepository;

    public PessoasModel cadastrarPessoa(PessoasModel individuo){
        return pessoasRepository.save(individuo);
    }

    public List<PessoasModel> buscarPessoasTodas(){
        return pessoasRepository.findAll();
    }

    public Optional<PessoasModel> buscarPessoaEspecifica(Long pessoaInd){
        return pessoasRepository.findById(pessoaInd);
    }

    public PessoasModel alterarPessoa(PessoasModel pessoasModel){
        return pessoasRepository.save(pessoasModel);
    }

    public void deletarPessoa(Long idPessoa){
        pessoasRepository.deleteById(idPessoa);

    }
}
