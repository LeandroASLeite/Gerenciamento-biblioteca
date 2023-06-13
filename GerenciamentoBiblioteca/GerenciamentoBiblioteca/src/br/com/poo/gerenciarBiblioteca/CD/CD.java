package br.com.poo.gerenciarBiblioteca.CD;

import br.com.poo.gerenciarBiblioteca.Item.Item;

public class CD extends Item {
    private String duracaoEmMinutos;

    public CD(String titulo, String autor, Integer anoPublicacao, Integer numeroCopiasDisponiveis, String duracaoEmMinutos) {
        super(titulo, autor, anoPublicacao, numeroCopiasDisponiveis);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
