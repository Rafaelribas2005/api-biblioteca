package com.projetoapi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @Transactional
    @PostMapping("/adicionar")
    public Livro criarLivro(@RequestBody Livro dadosLivro) {
        return livroRepository.save(dadosLivro);
    }

    @GetMapping("/buscar")
    public ResponseEntity listarLivros() {
        return ResponseEntity.ok(livroRepository.findAll());
    }

    // update

    @DeleteMapping("/deletar")
    public ResponseEntity deletarLivro(@RequestBody Livro dadosLivro) {
        livroRepository.delete(dadosLivro);
        return ResponseEntity.ok("foi o delete");
    }
}