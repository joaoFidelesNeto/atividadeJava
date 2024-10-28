package br.com.catolica.biblioteca.Module;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String anoDePublicacao;

    public Livro(String titulo, String autor, String ISBN, String AnoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.anoDePublicacao = AnoDePublicacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void  exibirInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Ano de Publicacao: " + this.anoDePublicacao);
    }
}
