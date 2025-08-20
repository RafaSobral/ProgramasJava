package modelo;


public class Animal {
    private String nome, especie, raca;
    private Cliente cliente;


    public Animal(String nome, String especie, String raca) {  //construtor
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }


    public Cliente getCliente() {   //get / set
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getRaca() {
        return raca;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }


   
}

