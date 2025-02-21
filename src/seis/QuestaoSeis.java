package seis;

// 6. Cálculo do Salário
// Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS.
// O programa deve calcular e exibir o salário líquido.

import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o desconto do INSS: ");
        double desconto = scanner.nextDouble();

        double liquido = salario - desconto;

        System.out.printf("O seu salário liquido é: %.2f%n", liquido);

        scanner.close();
    }
}
