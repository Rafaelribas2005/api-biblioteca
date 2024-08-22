package com.projetoapi.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String lancamento;
    private String sinopse;

    public Livro(String titulo, String autor, String lancamento, String sinopse) {
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
    } 
    
}
