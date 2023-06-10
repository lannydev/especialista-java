package compras;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String nomeTitular;
    private double saldo;

    public Cartao(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito){

        if (getSaldo() < valorDebito){
            throw new RuntimeException("Saldo insuficiente para a transação");
        }

        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor do depósito não pode ser inferior a %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }
        saldo += valorDeposito - TARIFA_DEPOSITO;

    }
}
