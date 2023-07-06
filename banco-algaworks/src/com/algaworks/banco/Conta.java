package com.algaworks.banco;

public class Conta {

    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;

    private Titular titular;
    private int agencia;
    private int numeroConta;
    private double saldo;

    private int tipo = NORMAL;


    /*public Conta(){

    }
     */

    public Conta(Titular titular, int agencia, int numeroConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public double getSaldoDisponivel(){
       return getSaldo();
    }

    public int getTipo() {
        return tipo;
    }


    protected void validarSaldoParaSaque(double valorSaque){
        if (getSaldoDisponivel() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("valor a sacar deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);
        saldo -= valorSaque;
       System.out.printf("Saque no valor R$%.2f efetuado com sucesso. Saldo atual: R$%.2f%n", valorSaque, getSaldo());
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
