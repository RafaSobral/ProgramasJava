package dominio;

public class Dominio {
    int id;
    String nome;
    int idade;
    Double peso;
    Double altura;

        public Dominio(int id, String nome, int idade, Double peso,Double altura){
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }

        public void listarPessoa() {
            System.out.println("Id:" + id);
            System.out.println("nome:" + nome);
            System.out.println("idade:" + idade);
            System.out.println("peso:" + peso);
            System.out.println("altura:" + altura);
        }

        public void calcularImc() {
            Double imc = peso / (altura * altura);

            if(imc < 18.5){
                System.out.print("Magreza");
            }else if(imc >= 18.5 && imc <= 24.9){
                System.out.print("Normal");
            }else if(imc >= 25 && imc <= 29.9){
                System.out.print("Sobrepeso");
            }else if(imc >= 30 && imc <= 34.9){
                System.out.print("Obesidade grau I");
            }else if(imc >= 35 && imc <= 39.9){
                System.out.print("Obesidade grau II");
            }else if(imc > 40 ){
                System.out.print("Obesidade grau III");
            }
        }

    
}