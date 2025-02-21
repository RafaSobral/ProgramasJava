package dez;

// 10. Distância Entre Dois Pontos
// Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano 
// e calcule a distância entre eles.

// Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)

import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cordenada x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a cordenada y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a cordenada x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite a cordenada y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));

        System.out.printf("Distancia entre os pontos: %.2f%n", distancia);

        scanner.close();
    }
}
