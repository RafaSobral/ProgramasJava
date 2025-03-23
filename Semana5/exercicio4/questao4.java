package exercicio4;

import java.util.Scanner;

public class questao4 {
    public static void main (String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano:");
        int ano = sc.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("Ano bissexto"); 
        } else{
            System.out.println("O ano nao e bissexto");
        }
        sc.close();

    }
    
}
