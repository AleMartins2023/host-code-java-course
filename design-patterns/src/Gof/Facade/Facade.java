package Gof.Facade;

import Gof.Facade.SubsistemaApiCep.CepApi;
import Gof.Facade.SubsistemaCrm.CrmService;

//a ideia é que ela seja uma interface, realizando operações para consolidar ou expor uma interface mais simples para uma operação que é mais complexa.
public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
