package Gof.Singleton;

import Gof.Strategy.Comportamento;
import Gof.Strategy.ComportamentoAgressivo;
import Gof.Strategy.ComportamentoDenfesivo;
import Gof.Strategy.ComportamentoNormal;
import Gof.Strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        //Singleton
        
        //para validar ser o Singleton está funcionando.
        //instancia

        //SingletonLazy: acessa pela classe
        SingletonLazy lazy = SingletonLazy.getInstancia();
        //para conferir o endereço de memória
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        //SingletonEager: acessa pela classe
        SingletonEager eager = SingletonEager.getInstancia();
        //para conferir o endereço de memória
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        //SingletonLazyHolder: acessa pela classe
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        //para conferir o endereço de memória
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy

        Comportamento defensivo = new ComportamentoDenfesivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
    
}
