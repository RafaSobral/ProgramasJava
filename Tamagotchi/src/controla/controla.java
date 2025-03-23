package controla;
import java.util.Scanner;
import tamagotchi.Bicho;

public class controla {
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do seu tamagotchi:");
        String nome = sc.nextLine();

        System.out.println("Menu de interacoes:");
        System.out.println("Exibir Status:(1)");
        System.out.println("Alimentar:(2)");
        System.out.println("Brincar:(3)");
        System.out.println("Dormir:(4)");
        System.out.println("Tomar Banho:(5)");
        System.out.print("Digite a opcao desejada:");
        int opcao = sc.nextInt();

        Bicho tamagotchi = new Bicho(nome, 0, 100, 0, 10, 50, 60, true);

        switch (opcao) {
            case 1:
                tamagotchi.exibirStatus();
                break;

            case 2:
                tamagotchi.alimentar();
                break;

            case 3:
                tamagotchi.brincar();
                break;

            case 4:
                tamagotchi.dormir();
                break;

            case 5:
                tamagotchi.tomarBanho();
                break;
        
            default:
            System.out.println("Opcao invalida!!");
                break;
        }



        sc.close();
    }
}
