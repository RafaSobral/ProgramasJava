package model;

public class CursoNaoEncontradoException extends Exception {
    public CursoNaoEncontradoException(String nome) {
        super("Curso não encontrado: " + nome);
    }
}
