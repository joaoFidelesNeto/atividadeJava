package br.com.catolica.biblioteca.Module;

public class Biblioteca {
    private String nome;
    private String endereco;
    private Livro[] listaDaBiblioteca;
    private int quantidadeLivros;

    public Biblioteca(String nome, String endereco , int quantidadeLivros) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeLivros = quantidadeLivros;

        if(quantidadeLivros > 0){
            listaDaBiblioteca = new Livro[quantidadeLivros];
        }

    }
    public void CadastrarLivro(Livro livro) {
        boolean cadastro = false;
        for(int i = 0; i < listaDaBiblioteca.length; i++){
            if(listaDaBiblioteca[i] == null){
                listaDaBiblioteca[i] = livro;
                System.out.println("Livro cadastrado com sucesso!");
                cadastro = true;
                break;
            }
        }
        if(!cadastro){
            System.out.println("Não foi possivel cadastrar livro!");
        }
    }
    public void verificarDiponibilidade(Livro livro) {
        boolean disponivel = false;
        for (int i = 0; i < listaDaBiblioteca.length; i++) {
            if (listaDaBiblioteca[i] != null && listaDaBiblioteca[i].equals(livro)) {
                System.out.println("O livro " + livro.getTitulo() + " está disponível.");
                disponivel = true;
                break;
            }
        }
        if (!disponivel) {
            System.out.println("O livro " + livro.getTitulo() + " está indisponível.");
        }
    }
    public void verificarTitulo(String titulo){
        for (int i = 0; i < quantidadeLivros; i++){
            if(listaDaBiblioteca[i].getTitulo().equals(titulo)){
                System.out.println("Livro foi encontrado");
                break;
            }
            else{
                System.out.println("Livro não foi encontrado");
                break;
            }
        }
    }
    public void verificarAutor(String autor){
        for (int i = 0; i < quantidadeLivros; i++){
            if(listaDaBiblioteca[i].getAutor().equals(autor)){
                System.out.println("Livro foi encontrado");
                break;
            }
            else{
                System.out.println("Não foi encontrado");
                break;
            }
        }
    }
    public void exibirInfo() {
        for (int i = 0; i < listaDaBiblioteca.length; i++) {
            if(listaDaBiblioteca[i] != null){
                System.out.println(listaDaBiblioteca[i].getTitulo());
            }
        }
    }
    public void devolverLivro(Usuario usuario , Livro livro){
        for (int i = 0; i < usuario.livrosEmPosse.length; i++){
            if(usuario.livrosEmPosse[i].equals(livro)){
                for(int j = 0; j < listaDaBiblioteca.length; j++){
                    if(listaDaBiblioteca[j] == null){
                        listaDaBiblioteca[j] = livro;
                        usuario.livrosEmPosse[i] = null;
                        System.out.println("Livro foi Devolvido a Biblioteca");
                        break;
                    }
                }
            }
        }
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        boolean emprestado = false;
        for (int i = 0; i < listaDaBiblioteca.length; i++) {
            if (listaDaBiblioteca[i] != null && listaDaBiblioteca[i].equals(livro)) {
                for (int j = 0; j < usuario.livrosEmPosse.length; j++) {
                    if (usuario.livrosEmPosse[j] == null) {
                        usuario.livrosEmPosse[j] = livro;
                        listaDaBiblioteca[i] = null;
                        System.out.println("Livro foi emprestado ao usuário.");
                        emprestado = true;
                        break;
                    }
                }
                if (emprestado) {
                    break;
                } else {
                    System.out.println("Usuário já atingiu o limite de livros.");
                }
            }
        }
        if (!emprestado) {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }
}


