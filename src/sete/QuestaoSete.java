package sete;

// 7. Cálculo do Perímetro e Área de um Retângulo
// Solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

// Fórmulas:

// Área = base × altura

// Perímetro = 2 × (base + altura).

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        
        double perimetro = 2 * (base + altura);

        System.out.printf("Area do triangulo: %.2f%n", area);

        System.out.printf("Perimetro do triangulo: %.2f%n", perimetro);
        
        scanner.close();
    }
    
}
