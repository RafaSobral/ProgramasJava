package controle;

import java.util.Scanner;

import modelo.Gerente;
import modelo.Setor;

public class programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cadastro do setor");

		System.out.println("Digite a sigla: ");
		String sigla = input.nextLine();
		System.out.println("Digite a descricao: ");
		String descricao = input.nextLine();
		
		
		System.out.println("Cadastro do gerente");
		
		System.out.println("Digite o cpf: ");
		String cpf = input.nextLine();
		System.out.println("Digite o nome: ");
		String nome = input.nextLine();
		
		Setor setor = new Setor(sigla, descricao);
		Gerente gerente = new Gerente(cpf, nome);
		
		
		setor.setGerente(gerente);
		gerente.setSetor(setor);
		
		System.out.println("O funcionario" + setor.getGerente().getNome() + "é gerente do setor" + gerente.getSetor().getDescricao() );
		

	}

}
