package nove;

// 9. Conversão de Moeda
// Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia.
// O programa deve calcular e exibir o valor equivalente em dólares (US$).

import java.util.Scanner;

public class QuestaoNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em reais:");
        double reais = scanner.nextDouble();

        System.out.println("Digite a cotação do dolar: ");
        double cotacao = scanner.nextDouble();

        double dolar = reais / cotacao;

        System.out.printf("%.2f%n Reais Em Dolar é: %.2f%n", reais, dolar);

        scanner.close();

    }
}
