package oito;

import java.util.Scanner;

// 8. Cálculo do Volume de uma Esfera
// Crie um programa que leia o raio de uma esfera e calcule o seu volume.

// Fórmula: V = (4/3) * π * raio³.

// Use π = 3.14159.

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = (4.0/3.0) * 3.14159 * (raio * raio * raio);

        System.out.printf("Volume da esfera: %.2f%n", volume);

        scanner.close();
    }
    
}
