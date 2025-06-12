import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorAutomoveis gerente = new GerenciadorAutomoveis();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Incluir automóvel");
            System.out.println("2 - Remover automóvel");
            System.out.println("3 - Alterar dados de automóvel");
            System.out.println("4 - Consultar automóvel por placa");
            System.out.println("5 - Listar automóveis (ordenado)");
            System.out.println("6 - Salvar e sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(sc.nextLine());
                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(sc.nextLine());
                    gerente.inserirAutomovel(new Automovel(placa, modelo, marca, ano, valor));
                }
                case 2 -> {
                    System.out.print("Informe a placa: ");
                    gerente.removerAutomovel(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Informe a placa do automóvel a alterar: ");
                    String placa = sc.nextLine();
                    System.out.print("Novo modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Nova marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Novo ano: ");
                    int ano = Integer.parseInt(sc.nextLine());
                    System.out.print("Novo valor: ");
                    double valor = Double.parseDouble(sc.nextLine());
                    gerente.alterarAutomovel(placa, modelo, marca, ano, valor);
                }
                case 4 -> {
                    System.out.print("Informe a placa: ");
                    Automovel a = gerente.buscarPorPlaca(sc.nextLine());
                    System.out.println(a != null ? a : "Automóvel não encontrado.");
                }
                case 5 -> {
                    System.out.print("Ordenar por (placa/modelo/marca): ");
                    gerente.listarAutomoveis(sc.nextLine());
                }
                case 6 -> gerente.salvarNoArquivo();
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
