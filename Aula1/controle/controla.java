package controle;
import dominio.Pessoa;
import java.util.Scanner;

public class controla{
  public static void main(String[]args ){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a ID:");
    int id = sc.nextInt();
    sc.nextLine();
 
    System.out.print("Digite o nome:");
    String nome = sc.nextLine();
    
    System.out.print("Digite a sua idade:");
    int idade = sc.nextInt();

    System.out.print("Digite o seu peso:");
    double peso = sc.nextDouble();

    System.out.print("Digite a sua altura:");
    double altura = sc.nextDouble();

    Pessoa pessoa = new Pessoa(id, nome, idade, peso, altura);

    pessoa.listarPessoa();

    sc.close();
  }
}