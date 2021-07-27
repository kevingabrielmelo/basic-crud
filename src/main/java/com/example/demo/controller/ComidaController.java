package com.example.demo.controller;

import com.example.demo.entity.Comida;
import com.example.demo.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/comida")
public class ComidaController {

    @Autowired
    ComidaRepository comidaRepository;

    @PostMapping
    public void salvarComida(@RequestBody Comida comida) {

        comidaRepository.save(comida);
    }

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Object> buscarComida() {

        return new ResponseEntity<Object>(comidaRepository.findAll(), HttpStatus.OK);
    }
}
