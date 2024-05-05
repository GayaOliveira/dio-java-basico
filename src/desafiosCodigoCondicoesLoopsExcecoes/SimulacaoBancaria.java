package desafiosCodigoCondicoesLoopsExcecoes;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar saldo");
        System.out.println("0. Encerrar");

        System.out.print("Selecione a operação desejada: ");


        double saldo = 0;

//        loop: while (true) {
//
//            int opcao = scanner.nextInt();
//
//            switch(opcao){
//
//                case 1:
//                    System.out.print("Qual o valor do depósito? ");
//                    double deposito = scanner.nextDouble();
//                    saldo += deposito;
//                    System.out.print("Saldo Atual: R$ " + String.format("%.2f", saldo));
//                    break;
//
//                case 2:
//                    System.out.print("Quanto deseja sacar? ");
//                    double saque = scanner.nextDouble();
//                    if (saque > saldo){
//                        System.out.println("Saldo insuficiente!");
//                    } else {
//                        saldo -= saque;
//                        System.out.print("Saldo Atual: R$ " + String.format("%.2f", saldo));
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("Saldo Atual: R$ " + String.format("%.2f", saldo));
//                    break;
//
//                case 4:
//                    System.out.print("Programa encerrado.");
//                    break loop;       // aqui, eu devo quebrar não só o switch, mas o while, que chamei de loop
//
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//            }
//        }

        while (true) {

            boolean continuarRodando = true;

            int opcao = scanner.nextInt();

            switch(opcao){

                case 1:
                    System.out.print("Qual o valor do depósito? ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
                    break;

                case 2:
                    System.out.print("Quanto deseja sacar? ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo){
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
                    }
                    break;

                case 3:
                    System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuarRodando = false;
                    break;       // aqui, eu devo quebrar não só o switch, mas o while, que chamei de loop

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (!continuarRodando) break;

            System.out.print("Selecione a operação desejada: ");

        }

    }
}
