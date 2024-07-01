import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo inicial da conta
        System.out.print("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Solicita e lê a quantidade total de transações
        System.out.print("Informe a quantidade de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicita e lê o tipo de transação
            System.out.print("Informe o tipo de transação (D para depósito, S para saque): ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Solicita e lê o valor da transação
            System.out.print("Informe o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e a adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            }
        }

        // Exibir o saldo final
        System.out.println("\nSaldo: " + saldo);

        // Exibir a lista de transações
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

// Classe para representar uma transação
class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

