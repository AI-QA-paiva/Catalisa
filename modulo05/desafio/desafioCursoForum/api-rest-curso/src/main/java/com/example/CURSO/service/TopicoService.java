package com.example.CURSO.service;

//import com.example.CURSO.model.enumeric.Status;
import com.example.CURSO.model.enumeric.TopicoModel;
//import com.example.CURSO.repository.IRespostaRepository;
import com.example.CURSO.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;
    //private IRespostaRepository respostaRepository

    public List<TopicoModel> buscarOsTopicosTodos(){
        return topicoRepository.findAll();

    }

    public Optional<TopicoModel> buscarTopicoEspecifico(Long codigo){
        return topicoRepository.findById(codigo);
    }

    public TopicoModel cadastrarTopico(TopicoModel topicoModel){//,RespostaModel respostaModel
        //respostaModel.setStatus(Status.NAO_RESPONDIDO);
        return topicoRepository.save(topicoModel);
        //return respostaRepository.save(respostaModel);
    }

    public TopicoModel alterandoTopicoEspecifico(TopicoModel topicoModel) {
        return topicoRepository.save(topicoModel);
    }

    public void deletarTopico(Long codigo){topicoRepository.deleteById(codigo);
    }

}
