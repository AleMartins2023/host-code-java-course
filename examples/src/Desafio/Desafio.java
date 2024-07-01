package Desafio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o saldo inicial: ");
            double saldo = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a taxa de juros: ");
            double taxaJuros = Double.parseDouble(scanner.nextLine());

            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

            System.out.println("\nConta Poupanca:");
            contaPoupanca.exibirInformacoes();
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Por favor, insira os dados no formato correto.");
        } catch (NumberFormatException e) {
            System.out.println("Erro de formatação. Certifique-se de que os números foram inseridos corretamente.");
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}


