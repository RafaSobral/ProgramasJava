import java.io.*;
import java.util.*;

public class GerenciadorAutomoveis {
    private ArrayList<Automovel> automoveis = new ArrayList<>();
    private final String arquivo = "automoveis.txt";

    public GerenciadorAutomoveis() {
        carregarDoArquivo();
    }

    public void inserirAutomovel(Automovel a) {
        if (buscarPorPlaca(a.getPlaca()) != null) {
            System.out.println("Erro: Já existe um automóvel com essa placa.");
        } else {
            automoveis.add(a);
            System.out.println("Automóvel adicionado com sucesso.");
        }
    }

    public void removerAutomovel(String placa) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            automoveis.remove(a);
            System.out.println("Automóvel removido com sucesso.");
        } else {
            System.out.println("Erro: Automóvel não encontrado.");
        }
    }

    public void alterarAutomovel(String placa, String modelo, String marca, int ano, double valor) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            a.setModelo(modelo);
            a.setMarca(marca);
            a.setAno(ano);
            a.setValor(valor);
            System.out.println("Automóvel alterado com sucesso.");
        } else {
            System.out.println("Erro: Automóvel não encontrado.");
        }
    }

    public Automovel buscarPorPlaca(String placa) {
        for (Automovel a : automoveis) {
            if (a.getPlaca().equalsIgnoreCase(placa)) return a;
        }
        return null;
    }

    public void listarAutomoveis(String criterio) {
        Comparator<Automovel> comparador = switch (criterio.toLowerCase()) {
            case "placa" -> Comparator.comparing(Automovel::getPlaca);
            case "modelo" -> Comparator.comparing(Automovel::getModelo);
            case "marca" -> Comparator.comparing(Automovel::getMarca);
            default -> null;
        };

        if (comparador == null) {
            System.out.println("Critério inválido.");
            return;
        }

        automoveis.stream()
                  .sorted(comparador)
                  .forEach(System.out::println);
    }

    public void salvarNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Automovel a : automoveis) {
                writer.write(a.toCSV());
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private void carregarDoArquivo() {
        File file = new File(arquivo);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 5) {
                    Automovel a = new Automovel(
                            dados[0],
                            dados[1],
                            dados[2],
                            Integer.parseInt(dados[3]),
                            Double.parseDouble(dados[4])
                    );
                    automoveis.add(a);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }
}
