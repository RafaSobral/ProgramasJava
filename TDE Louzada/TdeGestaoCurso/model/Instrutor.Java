package model;

public class Instrutor {
    private String nome;
    private String email;

    public Instrutor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void exibirDetalhes() {
        System.out.println("Instrutor: " + nome + " | Email: " + email);
    }
}
