package br.com.poo.gerenciarBiblioteca.Revista;

import br.com.poo.gerenciarBiblioteca.Item.Item;

public class Revista extends Item {
    private String numeroEdicao;

    public Revista(String titulo, String autor, Integer anoPublicacao, Integer numeroCopiasDisponiveis, String numeroEdicao) {
        super(titulo, autor, anoPublicacao, numeroCopiasDisponiveis);
        this.numeroEdicao = numeroEdicao;
    }
}
