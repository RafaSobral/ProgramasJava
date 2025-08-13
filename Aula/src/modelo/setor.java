package modelo;

public class Setor {
    private String sigla;
    private String descricao;
    private Gerente gerente; // Assuming Gerente is another class defined elsewhere

    // Constructor
    public Setor(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    // Getter and Setter for sigla
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    // Getter and Setter for descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter and Setter for gerente
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
