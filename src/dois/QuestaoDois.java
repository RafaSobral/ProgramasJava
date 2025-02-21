package dois;
// 2. Área de um Círculo
// Desenvolva um programa que leia o raio de um círculo e calcule sua área.

import java.util.Scanner;

public class QuestaoDois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o raio de um circulo: ");
		double raio = scanner.nextDouble();
		
		double area = 3.14159 * raio;
		
		System.out.print(area);
		
		scanner.close();
		
	}
}
