package br.com.poo.gerenciarBiblioteca.Item;

public class Item {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Integer numeroCopiasDisponiveis;

    public Item(String titulo, String autor, Integer anoPublicacao, Integer numeroCopiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroCopiasDisponiveis = numeroCopiasDisponiveis;
    }
    public void obterDados(){

    }
    public void obterTipo(){

    }
}
