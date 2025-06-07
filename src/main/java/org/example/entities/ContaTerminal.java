package org.example.entities;

public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

    }

    public void dadosCliente() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está " +
                "disponível para saque");
    }

}
