package com.projetoapi.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoapi.demo.dto.DadosListagemLivro;
import com.projetoapi.demo.model.Livro;
import com.projetoapi.demo.repository.LivroRepository;

import jakarta.transaction.Transactional;

@RestController
public class LivroController {
  
    @Autowired
    LivroRepository livroRepository;
    
    @GetMapping("/buscar")
    public ResponseEntity<List<DadosListagemLivro>> listarLivros() {
        var lista = livroRepository.findAll().stream().map(DadosListagemLivro::new).toList();
        return ResponseEntity.ok(lista);
    }

    @Transactional
    @PostMapping("/adicionar")
    public Livro criarLivro(@RequestBody Livro dadosLivro) {
        return livroRepository.save(dadosLivro);
    }
    //ola
}

// maik legal
