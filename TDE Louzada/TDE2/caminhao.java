public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, double capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Caminhão - Modelo: %s | Placa: %s | Ano: %d | Capacidade: %.2f toneladas\n",
                getModelo(), getPlaca(), getAno(), capacidadeCarga);
    }
}
