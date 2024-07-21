package Gof.Strategy;

//garantindo que quem irá utilizar está classe, necessariamente implementa os métodos da interface
public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println("Movendo-se normalmente.");
    }
    
}
