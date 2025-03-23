package exercicio1;

import java.util.Scanner;

public class questao1 {
    public static void main (String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:");
        int valor1 = sc.nextInt();

        if(valor1 % 2 == 0){
            System.out.print("O numero é par");
        } else {
            System.out.print("O numero é impar");
        }

        sc.close();

    }
}