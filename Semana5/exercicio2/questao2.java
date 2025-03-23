package exercicio2;

import java.util.Scanner;

public class questao2 {
    public static void main (String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Menor de idade");
        } if(idade >= 18 && idade <= 60){
            System.out.println("Adulto");
        } if(idade > 60){
            System.out.println("Idoso");
        }

        sc.close();
    } 
}
