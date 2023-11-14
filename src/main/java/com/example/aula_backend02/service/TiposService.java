package com.example.aula_backend02.service;

import com.example.aula_backend02.dto.TiposDTO;
import com.example.aula_backend02.mapper.TiposMapper;
import com.example.aula_backend02.model.Tipos;
import com.example.aula_backend02.repository.TiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TiposService {

    @Autowired
    TiposRepository repository;

    public ResponseEntity<?> getTipos(Long id){
        Optional<Tipos> obj = repository.findById(id);
        if(obj.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(TiposMapper.INSTANCE.toDto(obj.get()));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tipos não encontrados!");
    }

    public List<TiposDTO> findAllTipos(){
        List<Tipos> lista = repository.findAll();
        List<TiposDTO> listaTipos = new ArrayList<>();
        for(Tipos t : lista){
            listaTipos.add(TiposMapper.INSTANCE.toDto(t));
        }
        return listaTipos;
    }

}
