package desafiosCodigoCondicoesLoopsExcecoes;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saldo = limiteDiario;
        double saques[] = new double[50];

        for (double saque: saques){

            saque = scanner.nextDouble();

            if(saque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            if (saque <= limiteDiario){
                saldo -= saque;
                System.out.println("Saque realizado. Limite restante: " + saldo);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

        }

        scanner.close();
    }

}
