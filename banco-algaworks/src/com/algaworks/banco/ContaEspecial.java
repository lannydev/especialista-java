package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento{
     private double valorTotalInvestimento;

    private double taxaConta;
    private double limiteChequeEspecial;


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


    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel()<valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void debitarTarifaMensal(){
            sacar(getTaxaConta());

   }


   @Override
   public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());

    }

}
