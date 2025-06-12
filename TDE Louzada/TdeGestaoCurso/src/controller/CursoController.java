package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class CursoController {
    private List<Curso> cursos = new ArrayList<>();

    public void cadastrarCurso(String nomeCurso, String nomeInstrutor, String emailInstrutor, List<Aula> aulas)
            throws CampoObrigatorioException {
        if (nomeCurso == null || nomeCurso.isEmpty())
            throw new CampoObrigatorioException("Nome do Curso");
        if (nomeInstrutor == null || nomeInstrutor.isEmpty())
            throw new CampoObrigatorioException("Nome do Instrutor");

        Instrutor instrutor = new Instrutor(nomeInstrutor, emailInstrutor);
        Curso curso = new Curso(nomeCurso, instrutor);
        for (Aula aula : aulas) {
            curso.adicionarAula(aula);
        }
        cursos.add(curso);
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarCursoPorNome(String nome) throws CursoNaoEncontradoException {
        return cursos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new CursoNaoEncontradoException(nome));
    }

    public void removerCurso(String nome) throws CursoNaoEncontradoException {
        Curso curso = buscarCursoPorNome(nome);
        cursos.remove(curso);
    }
}
