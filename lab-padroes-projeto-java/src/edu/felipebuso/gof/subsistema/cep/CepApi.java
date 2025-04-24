package edu.felipebuso.gof.subsistema.cep;

import edu.felipebuso.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Caetano do Sul";
    }

    public String recuperarEstado(String cep) {
        return "São Paulo";
    }
}
