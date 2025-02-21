package tres;
// 3. Conversão de Temperatura
// Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = ((Celsius * 9) / 5) +32;

        System.out.printf("A temperatura convertida para Fahrenheit é: %.2f%n", Fahrenheit);

        scanner.close();

    }
    
}
