package controle;

import java.util.Scanner;

import dominio.PessoaFisica;
import dominio.PessoaJuridica;

public class ControleCliente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Cadastro de Cliente");
		System.out.println("Digite o CPF/CNPJ");
		String c = input.nextLine();
		
		System.out.println("Digite o nome/razão social:");
		String descricao = input.nextLine();
		
		System.out.println("Digite o endereco:");
		String endereco = input.nextLine();
		
		System.out.println("Digite o telefone");
		String telefone = input.nextLine();
		
		System.out.print("Digite 1 para PF E 2 para PJ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				PessoaFisica pf = new PessoaFisica(endereco, telefone, c, descricao);
				
				System.out.println("CLIENTE CADASTRADO");
				System.out.println("CPF: " + pf.getCpf());
				System.out.println("Nome: " + pf.getNome());
				System.out.println("Endereco: " + pf.getEndereco());
				System.out.println("Telefone: " + pf.formatarTelefone());
				break;
			case 2:
				PessoaJuridica pj = new PessoaJuridica(endereco, telefone, c, descricao);
				System.out.println("CLIENTE CADASTRADO");
				System.out.println("CNPJ:" + pj.getcnpjFormatado());
				System.out.println("Nome: " + pj.getRazaoSocial());
				System.out.println("Endereco: " + pj.getEndereco());
				System.out.println("Telefone: " + pj.formatarTelefone());
				break;
		}
				
		

	}

}
