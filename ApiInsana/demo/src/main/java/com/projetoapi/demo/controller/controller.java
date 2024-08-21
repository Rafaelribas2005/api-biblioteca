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

@RestController
@RequestMapping("/api/livros")
public class controller {
    @Autowired
    LivroRepository livroRepository;
    
    @GetMapping
    public ResponseEntity listarLivros() {
      //  List<Livro> livros = livroRepository.findAll();
       // return ResponseEntity.ok(livros);
       return ResponseEntity.ok("ok");
    }

    @Transactional
    @PostMapping("/criarlivro")
    public ResponseEntity criarLivro(@RequestBody Livro DadosLivro) {
        // Livro livro = new Livro(DadosLivro.setTitulo(),DadosLivro.setAutor(),DadosLivro.setLancamento(),DadosLivro.setSinopse());
        livroRepository.save(DadosLivro);
        System.out.println("lero lero");
        return new ResponseEntity<>("Vaga cadastrada com sucesso!", HttpStatus.CREATED);
        
    }
}
