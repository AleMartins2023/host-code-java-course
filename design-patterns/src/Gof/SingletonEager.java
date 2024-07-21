package Gof;

public class SingletonEager {

    // instancia dele mesmo e atribui a instância
    private static SingletonEager instancia = new SingletonEager();

    // construtor de forma que ninguém externo instancie este Singleton
    private SingletonEager(){
        super();
    }

    // garantir que será exposta para quem está chamando
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
