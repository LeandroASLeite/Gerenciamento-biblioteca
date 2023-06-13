package br.com.poo.gerenciarBiblioteca.Livro;

import br.com.poo.gerenciarBiblioteca.Item.Item;

public class Livro extends Item {
    private String genero;

    public Livro(String titulo, String autor, Integer anoPublicacao, Integer numeroCopiasDisponiveis, String genero) {
        super(titulo, autor, anoPublicacao, numeroCopiasDisponiveis);
        this.genero = genero;
    }
}
