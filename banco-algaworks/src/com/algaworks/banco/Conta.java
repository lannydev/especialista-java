package com.algaworks.banco;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

   public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("valor a sacar deve ser maior que 0");
        }
        if (saldo < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }

        saldo -= valorSaque;
       System.out.println("Saque no valor R$%.2f efetuado com sucesso. Saldo atual: R$%.2f%n");
   }

   public void depositar(double valordeposito){
        if (valordeposito <= 0){
            throw new IllegalArgumentException("O valor a ser depositado deve ser maior que 0");
        }
        saldo += valordeposito;
        System.out.printf("Depósito no valor R$%.2f efetuado com sucesso, saldo atual: R$%.2f%n",
               valordeposito, getSaldo());
   }

   public void imprimirDemonstrativo(){
       System.out.println();
       System.out.printf("Agência: %d%n", getAgencia());
       System.out.printf("Conta: %d%n", getNumeroConta());
       System.out.printf("Titular: %s%n", getTitular().getCpf());
       System.out.printf("Saldo: %.2f%n", getSaldo());
   }

}
