package model;

public class Aula extends Conteudo {
    public Aula(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aula: " + titulo + " - " + descricao);
    }
}
