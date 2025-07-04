public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String placa, String modelo, int ano, int qtdPortas) {
        super(placa, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Carro - Modelo: %s | Placa: %s | Ano: %d | Portas: %d\n",
                getModelo(), getPlaca(), getAno(), qtdPortas);
    }
}
