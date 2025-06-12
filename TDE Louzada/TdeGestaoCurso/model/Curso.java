package model;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Exibivel {
    private String nome;
    private Instrutor instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        instrutor.exibirDetalhes();
        System.out.println("Aulas:");
        for (Aula aula : aulas) {
            aula.exibirDetalhes();
        }
    }
}
