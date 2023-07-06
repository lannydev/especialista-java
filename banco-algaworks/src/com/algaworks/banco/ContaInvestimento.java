package com.algaworks.banco;

public class ContaInvestimento extends Conta{

    private double valorTotalInvestimento;

    public ContaInvestimento(Titular titular, int agencia, int numeroConta) {
        super(titular, agencia, numeroConta);
    }

    public double getValorTotalInvestimento() {
        return valorTotalInvestimento;
    }


    public void creditarInvestimentos(double percentualTaxa){
            double valorInvestimento = getSaldo() * percentualTaxa / 100;
            valorTotalInvestimento += valorInvestimento;
            System.out.printf("Valor total do investimento neste período é R$%.2f%n", valorTotalInvestimento);
            depositar(valorInvestimento);
    }



}
