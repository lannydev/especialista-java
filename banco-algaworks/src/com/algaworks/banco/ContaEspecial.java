package com.algaworks.banco;

public class ContaEspecial {
    private Titular titular;
    private int agencia;
    private int numeroConta;
    private double saldo;



    private double valorTotalInvestimento;

    private double taxaConta;
    private double limiteChequeEspecial;

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

    public double getSaldoDisponivel(){
       return getSaldo() + getLimiteChequeEspecial();
    }

    public double getValorTotalInvestimento() {
        return valorTotalInvestimento;
    }

    public double getTaxaConta() {
        return taxaConta;
    }

    public void setTaxaConta(double taxaConta) {
        /*if (getTipo() != ESPECIAL){
            throw new RuntimeException("Este tipo de conta não possui taxa");
        }*/

        this.taxaConta = taxaConta;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {

        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void creditarInvestimentos(double percentualTaxa){
            double valorInvestimento = getSaldo() * percentualTaxa / 100;
            valorTotalInvestimento += valorInvestimento;
            System.out.printf("Valor total do investimento neste período é R$%.2f%n", valorTotalInvestimento);
            depositar(valorInvestimento);

    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("valor a sacar deve ser maior que 0");
        }
        if (getSaldoDisponivel() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }

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

   public void debitarTarifaMensal(){
            sacar(getTaxaConta());

   }

}
