package Gof.Facade.SubsistemaApiCep;

public class CepApi {

    //Criação do Singleton
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    //criação dos métodos
    public String recuperarCidade(String cep) {
        return "Cidade";
    }

    public String recuperarEstado(String cep) {
        return "Estado";
    }
}
