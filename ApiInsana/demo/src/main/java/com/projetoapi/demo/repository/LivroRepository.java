package com.projetoapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long> {

    
}