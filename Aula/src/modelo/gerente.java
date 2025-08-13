package modelo;

public class Gerente {
    private String cpf;
    private String nome;
    private Setor setor; // Represents the department the Gerente is managing

    // Constructor
    public Gerente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Getter and Setter for cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter and Setter for nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter and Setter for setor
    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
