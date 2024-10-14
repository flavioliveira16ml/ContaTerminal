package edu.flavio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

            System.out.println("Bem vindo ao BANCO");
                System.out.println();

            System.out.println("Por favor, digite o número da conta! ");
                numero = scanner.nextInt();
                scanner.nextLine();

            System.out.println("Por favor, digite o número da agência! ");
                agencia = scanner.nextLine();

            System.out.println("Por favor, informe seu nome! ");
                nomeCliente = scanner.nextLine();

            System.out.println("Por favor, informe o saldo! ");
                saldo = scanner.nextDouble();

            System.out.printf("Bem vindo ao Banco, %s, " + "o número de sua agência é %s, " + "o número de sua conta é %d " + "e seu saldo atual de %2.f já está disponível para saque!", nomeCliente, agencia, numero, saldo);

        scanner.close();

    }
}
