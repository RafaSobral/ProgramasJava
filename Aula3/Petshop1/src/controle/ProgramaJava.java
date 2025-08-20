package controle;

import java.util.Scanner;
import modelo.Animal;
import modelo.Cliente;


public class ProgramaJava {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Cadastro de cliente");


        System.out.print("CPF: ");
        String cpf = input.nextLine();


        System.out.print("Nome: ");
        String nome = input.nextLine();


        Cliente cliente = new Cliente(cpf, nome);


        System.out.println("Cadastro de animais");
        for(int i =  0; i < 3; i++){


            System.out.print("Nome: ");
            nome = input.nextLine();


            System.out.print("Especie: ");
            String especie = input.nextLine();


            System.out.print("Raça: ");
            String raca = input.nextLine();


            Animal animal = new Animal(nome, especie, raca);
            cliente.addAnimal(animal);
            
            
        }
        
        System.out.println("Animais do cliente " + cliente.getNome());        
        //System.out.println(cliente.getAnimais());
        for(Animal animal : cliente.getAnimais()){
        	System.out.print("Nome: " + animal.getNome());
        	System.out.print("Espécie: " + animal.getEspecie());
        	System.out.println("Raca: " + animal.getRaca());
        }
    }
}


