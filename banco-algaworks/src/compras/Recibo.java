package compras;

public class Recibo {

    public String titularDaCompra;
    public String descricao;
    public double valor;

    public Recibo(String titularDaCompra, String descricao, double valor) {
        this.titularDaCompra = titularDaCompra;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println(".............................");
        System.out.printf("RECIBO PARA %s%n", titularDaCompra);
        System.out.printf("%s -> %.2f%n", descricao, valor);
        System.out.println(".............................");
    }
}
