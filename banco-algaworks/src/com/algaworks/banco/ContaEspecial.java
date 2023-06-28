package com.algaworks.banco;

public class ContaEspecial extends Conta{
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

    public void creditarInvestimentos(double percentualTaxa){
            double valorInvestimento = getSaldo() * percentualTaxa / 100;
            valorTotalInvestimento += valorInvestimento;
            System.out.printf("Valor total do investimento neste período é R$%.2f%n", valorTotalInvestimento);
            depositar(valorInvestimento);

    }

   public void debitarTarifaMensal(){
            sacar(getTaxaConta());

   }

}
