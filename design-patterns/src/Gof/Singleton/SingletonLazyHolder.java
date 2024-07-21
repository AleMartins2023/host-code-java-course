package Gof.Singleton;

public class SingletonLazyHolder {

    // vai encapsular a instância em uma classe estática interna: holder
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // construtor de forma que ninguém externo instancie este Singleton
    private SingletonLazyHolder(){
        super();
    }

    // garantir que será exposta para quem está chamando
    public static SingletonLazyHolder getInstancia(){
        //ao invés de acessar diretamente a instancia, acessa pelo holder
        return Holder.instancia;
    }
}
