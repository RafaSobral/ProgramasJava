package view;

import controller.CursoController;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CursoController controller = new CursoController();

        int opcao;

        do {
            System.out.println("\n--- Sistema de Gestão de Cursos Online ---");
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Listar cursos");
            System.out.println("3. Buscar curso por nome");
            System.out.println("4. Remover curso");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Nome do curso: ");
                        String nomeCurso = sc.nextLine();

                        System.out.print("Nome do instrutor: ");
                        String nomeInstrutor = sc.nextLine();

                        System.out.print("Email do instrutor: ");
                        String emailInstrutor = sc.nextLine();

                        List<Aula> aulas = new ArrayList<>();
                        String adicionarMais;
                        do {
                            System.out.print("Título da aula: ");
                            String titulo = sc.nextLine();

                            System.out.print("Descrição da aula: ");
                            String descricao = sc.nextLine();

                            aulas.add(new Aula(titulo, descricao));

                            System.out.print("Adicionar outra aula? (s/n): ");
                            adicionarMais = sc.nextLine();
                        } while (adicionarMais.equalsIgnoreCase("s"));

                        controller.cadastrarCurso(nomeCurso, nomeInstrutor, emailInstrutor, aulas);
                        System.out.println("Curso cadastrado com sucesso!");
                    }

                    case 2 -> {
                        List<Curso> cursos = controller.listarCursos();
                        if (cursos.isEmpty()) {
                            System.out.println("Nenhum curso cadastrado.");
                        } else {
                            cursos.forEach(Curso::exibirDetalhes);
                        }
                    }

                    case 3 -> {
                        System.out.print("Nome do curso: ");
                        String nomeBusca = sc.nextLine();
                        Curso curso = controller.buscarCursoPorNome(nomeBusca);
                        curso.exibirDetalhes();
                    }

                    case 4 -> {
                        System.out.print("Nome do curso a remover: ");
                        String nomeRemover = sc.nextLine();
                        controller.removerCurso(nomeRemover);
                        System.out.println("Curso removido com sucesso!");
                    }

                    case 0 -> System.out.println("Saindo...");

                    default -> System.out.println("Opção inválida.");
                }
            } catch (CursoNaoEncontradoException | CampoObrigatorioException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        sc.close();
    }
}
