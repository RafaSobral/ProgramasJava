package tamagotchi;

public class Bicho{
    String nome;
    int idade = 0;
    int fome = 100;
    int felicidade = 0;
    int energia = 10;
    int higiene = 50;
    int saude = 60;
    boolean vida = true;

    public Bicho( String nome,int idade,int fome,int felicidade,int energia,int higiene,int saude,boolean vida){
        this.nome = nome;
        this.idade = idade; 
        this.fome = fome;
        this.felicidade = felicidade;
        this.energia = energia;
        this.higiene = higiene;
        this.saude = saude;
        this.vida = vida; 
    }


    public void exibirStatus(){
        System.out.println("Status de vida do: " + nome);
        System.out.println("Idade: " + idade );
        System.out.println("Fome: " + fome );
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Energia: " + energia);
        System.out.println("Higiene: " + higiene);
        System.out.println("Saude: " + saude);
        System.out.println("Vivo: " + vida);

    }

    public void alimentar(){
        if (vida == true) {
            fome = fome - 10;
            higiene = higiene - 10;
            energia = energia + 10;
            System.out.println("Voce alimentou o " + nome);
            System.out.println("Fome atual:" + fome);
            System.out.println("Higiene atual:" + higiene);
            System.out.println("Energia atual:" + energia);
        }else{
            System.out.println("Nao e possivel alimentar o tamagotchi morto");
        }
    }

    public void brincar(){
        if (vida == true) {
        saude = saude + 10;
        felicidade = felicidade + 10;
        energia = energia - 20;
        System.out.println("O " + nome + "Esta brincando!");
        System.out.println("Felicidade atual:" + felicidade);
        System.out.println("Energia atual:" + energia);
        System.out.println("Saude atual:" + saude);
        }else{
            System.out.println("Nao e possivel brincar com o tamagotchi morto");
        }   
    }

    public void dormir(){
        if (vida == true) {
            saude = saude + 10;
            felicidade = felicidade + 10;
            energia = energia + 50;
            System.out.println("O " + nome + "Esta dormindo!");
            System.out.println("Felicidade atual:" + felicidade);
            System.out.println("Energia atual:" + energia);
        }else{
            System.out.println("Nao e possivel realizar essa acao pois o tamagotchi esta morto");
        }        
    }

    public void tomarBanho(){
        if (vida == true) {
            higiene = higiene + 10;
            saude = saude + 10;
            System.out.println("O " + nome + "Esta no banho!");
            System.out.println("Felicidade atual:" + felicidade);
            System.out.println("Higiene atual:" + higiene);
            System.out.println("Saude atual:" + saude);
        }else{
            System.out.println("Nao e possivel realizar essa acao pois o tamagotchi esta morto");
        }
    }

    public void morte(){
        if (saude == 0) {
            vida = false;
            System.out.print("O" + nome + "Morreuuu :(");
        }
    }



}