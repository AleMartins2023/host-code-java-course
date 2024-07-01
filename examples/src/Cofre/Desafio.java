package Cofre;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de cofre (digital ou fisico): ");
        String tipoCofre = scanner.nextLine();
        
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.print("Digite a senha do cofre digital: ");
            int senha = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Confirme a senha do cofre digital: ");
            int confirmacaoSenha = Integer.parseInt(scanner.nextLine());
            
            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();
            
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido.");
        }
        
        scanner.close();
    }
}
