package Gof.Strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento (Comportamento comportamento) {
    //o robô pode mudar de comportamento.
    this.comportamento = comportamento;
    }

    public void mover() {
    //delegar a responsabilidade de movimentação para a strategy
        comportamento.mover();
    }
}
