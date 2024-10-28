package br.com.catolica.biblioteca.Main;
import br.com.catolica.biblioteca.Module.Biblioteca;
import br.com.catolica.biblioteca.Module.Livro;
import br.com.catolica.biblioteca.Module.Usuario;


public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("João", "001",
                "joao@gmail.com", 5);
        Usuario usuario2 = new Usuario("Allan", "002",
                "myBalls@gmail.com", 5);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central",
                "Beco da facada", 10);

        Livro livro1 = new Livro("Dom Casmurro",
                "Machado de Assis", "00001", "1899");
        Livro livro2 = new Livro("1984",
                "George Orwell", "00002", "1949" );

        biblioteca.CadastrarLivro(livro2);
        biblioteca.CadastrarLivro(livro1);
        biblioteca.emprestarLivro(usuario1 , livro2);
        biblioteca.exibirInfo();

    }
}



