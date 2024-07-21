package Gof;

public class SingletonLazy {

    // instancia dele mesmo
    private static SingletonLazy instancia;

    // construtor de forma que ninguém externo instancie este Singleton
    private SingletonLazy(){
        super();
    }

    // garantir que será exposta para quem está chamando
    public static SingletonLazy getInstancia(){
        //preparar a instância para ser retornada, ou seja, vamos instanciá-la
        if (instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
