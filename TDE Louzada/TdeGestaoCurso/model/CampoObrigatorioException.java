package model;

public class CampoObrigatorioException extends Exception {
    public CampoObrigatorioException(String campo) {
        super("O campo '" + campo + "' é obrigatório.");
    }
}
