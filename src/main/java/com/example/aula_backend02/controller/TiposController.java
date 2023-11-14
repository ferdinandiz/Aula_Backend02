package com.example.aula_backend02.controller;

import com.example.aula_backend02.service.TiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TiposController {

    @Autowired
    TiposService service;

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<?> findAllTipos(){
        return service.findAllTipos();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTipos(@PathVariable("id") Long id){
        return service.getTipos(id);
    }

}
