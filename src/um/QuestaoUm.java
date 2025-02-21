package um;
// 1. Soma de Dois Números
// Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.


import java.util.Scanner;

public class QuestaoUm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor:");
		double valor1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		double soma = valor1 + valor2;
		
		System.out.print("A Soma é: " + soma);
		
		scanner.close();
		
		
	}
	
}
