package controle;

import java.util.Scanner;

public class programa {
	
	
	// Metodo iterativo
	public static int somarIterativo(int num) {
		int soma = 0;
				
		for(int i = 1; i <= num; i++)
			soma +=1;
				
		return soma;
	}
	
	
	
	// Metodo recursivo
	public static int somarRecursivo(int num) {
		if(num < 0)
			return 0;
		
		return num +  somarRecursivo(num - 1);
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = input.nextInt();
		
		System.out.println("Soma iterativa: " + somarIterativo(num));
		System.out.println("Soma iterativa: " + somarRecursivo(num));

	}
	
}
