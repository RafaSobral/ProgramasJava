package controla;
import dominio.*;
import java.util.Scanner;


public class Controla {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
System.out.print("Digite a ID: ");
   int id = scanner.nextInt();
   scanner.nextLine();
System.out.print("Digite o nome: ");
   String nome = scanner.nextLine();
System.out.print("Digite a idade: ");
   int idade = scanner.nextInt();
System.out.print("Digite o peso: ");
   double peso = scanner.nextDouble();
System.out.print("Digite a altura: ");
   double altura = scanner.nextDouble();
   
    Dominio pessoa = new Dominio(id,nome,idade,peso,altura);
   
   pessoa.listarPessoa();
   pessoa.calcularImc();
   
   scanner.close();
   }

}