package com.example.aula_backend02.service;

import com.example.aula_backend02.dto.PessoaDto;
import com.example.aula_backend02.mapper.PessoaMapper;
import com.example.aula_backend02.model.Pessoa;
import com.example.aula_backend02.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public void save(PessoaDto pessoaDto){
        Pessoa entity = PessoaMapper.INSTANCE.toModel(pessoaDto);
        pessoaRepository.save(entity);
    }

    public ResponseEntity<?> getPessoa(Long id){
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if(pessoa.isPresent())
            return ResponseEntity.status(HttpStatus.OK).body(PessoaMapper.INSTANCE.toDto(pessoa.get()));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada!");
    }

}
