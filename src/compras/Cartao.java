package compras;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    public String nomeTitular;
    public double saldo;

    public Cartao(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
