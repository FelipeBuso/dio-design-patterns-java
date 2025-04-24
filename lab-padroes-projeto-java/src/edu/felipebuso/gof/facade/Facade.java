package edu.felipebuso.gof.facade;

import edu.felipebuso.gof.subsistema.cep.CepApi;
import edu.felipebuso.gof.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
