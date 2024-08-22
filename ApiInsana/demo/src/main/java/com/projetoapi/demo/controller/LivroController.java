package com.projetoapi.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoapi.demo.model.Livro;
import com.projetoapi.demo.repository.LivroRepository;

import jakarta.transaction.Transactional;

@RestController("/livro")
public class LivroController {
  
    @Autowired
    LivroRepository livroRepository;
    
    @GetMapping
    public List<Livro> listarLivros() {
       return livroRepository.findAll();
    }

    @Transactional
    @PostMapping
    public Livro criarLivro(@RequestBody Livro dadosLivro) {
        return livroRepository.save(dadosLivro);
    }
}

// maik legal
