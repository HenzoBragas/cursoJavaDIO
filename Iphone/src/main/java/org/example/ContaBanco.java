package org.example;
import org.example.entities.ContaTerminal;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite seu saldo !");
        double saldo = sc.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia,nomeCliente, saldo );

        contaTerminal.dadosCliente();
        sc.close();

    }
}
