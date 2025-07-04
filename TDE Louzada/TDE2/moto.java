public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String modelo, int ano, int cilindrada) {
        super(placa, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Moto - Modelo: %s | Placa: %s | Ano: %d | Cilindrada: %dcc\n",
                getModelo(), getPlaca(), getAno(), cilindrada);
    }
}
