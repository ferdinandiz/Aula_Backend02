package com.example.aula_backend02.controller;

import com.example.aula_backend02.dto.PessoaDto;
import com.example.aula_backend02.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService service;

    @PostMapping(value = "/salvar",produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody PessoaDto pessoaDto){
        service.save(pessoaDto);
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPessoa(@PathVariable("id") Long id){
        return service.getPessoa(id);
    }

}
