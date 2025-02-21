package quatro;
// 4. Cálculo de Média Simples
// Faça um programa que solicite ao usuário três notas (valores decimais) 
// e exiba a média aritmética delas.

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética é: %.2f%n", media);

        scanner.close();
    }
}
