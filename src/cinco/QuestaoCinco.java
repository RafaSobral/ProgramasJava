package cinco;
// 5. Conversão de Idade para Dias
// Desenvolva um programa que leia a idade de uma pessoa em anos 
// e exiba a quantidade aproximada de dias que ela já viveu.

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        int dias = idade * 365;

        System.out.printf("Você já viveu %d%n dias.", dias);

        scanner.close();
    }
}
