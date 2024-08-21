package com.projetoapi.demo.dto;

import com.projetoapi.demo.model.Livro;

public record Dadoslivro(
    long id,
    String titulo,
    String autor,
    String lancamento,
    String sinopse
) {
    public Dadoslivro(Livro livro) {
        this(livro.getId(),
             livro.getTitulo(),
             livro.getAutor(),
             livro.getLancamento(),
             livro.getSinopse());
    }
}
