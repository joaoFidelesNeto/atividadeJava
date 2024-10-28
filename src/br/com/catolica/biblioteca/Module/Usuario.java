package br.com.catolica.biblioteca.Module;

public class Usuario {
    private String nome;
    private String ID;
    private String email;
    Livro[] livrosEmPosse;
    public int limiteDeLivros;

    public Usuario(String nome, String ID, String email, int limiteDeLivros) {
        this.nome = nome;
        this.ID = ID;
        this.email = email;
        this.limiteDeLivros = limiteDeLivros;

        if(limiteDeLivros <= 0) {
            this.livrosEmPosse= new Livro[5];
        }
        else{
            this.livrosEmPosse = new Livro[limiteDeLivros];
        }
    }
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + ID);
        System.out.println("E-mail: " + email);
        for(int i = 0; i < livrosEmPosse.length; i++) {
            System.out.println(" - " + livrosEmPosse[i].getTitulo());
        }
    }
}
