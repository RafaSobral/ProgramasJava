package exercicio3;

import java.util.Scanner;

public class questao3 {
    public static void main (String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor:");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor:");
        double valor2 = sc.nextDouble();

        System.out.print("Digite a operacao deseja: + , - , * , /");
        char opcao = sc.next().charAt(0);

        switch(opcao) {
            case '+':
                System.out.println(valor1 + valor2);
                break;

            case '-':
                System.out.println(valor1 - valor2);
                break;

            case '*':
                System.out.println(valor1 * valor2);
                break;

            case '/':
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                } else{
                    System.out.println("Erro: Divisao por zero!");
                }
                break;

                
            default:
                System.out.println("Operacao invalida");

        }

        sc.close();
    }
    
}
