import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                    int tipo = Integer.parseInt(sc.nextLine());

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(sc.nextLine());

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Quantidade de portas: ");
                            int portas = Integer.parseInt(sc.nextLine());
                            lista.add(new Carro(placa, modelo, ano, portas));
                        }
                        case 2 -> {
                            System.out.print("Cilindrada: ");
                            int cilindrada = Integer.parseInt(sc.nextLine());
                            lista.add(new Moto(placa, modelo, ano, cilindrada));
                        }
                        case 3 -> {
                            System.out.print("Capacidade de carga (ton): ");
                            double carga = Double.parseDouble(sc.nextLine());
                            lista.add(new Caminhao(placa, modelo, ano, carga));
                        }
                        default -> System.out.println("Tipo inválido.");
                    }
                }
                case 2 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        System.out.println("\n== VEÍCULOS CADASTRADOS ==");
                        for (Veiculo v : lista) {
                            v.exibirDados();  // Polimorfismo em ação
                        }
                    }
                }
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}
