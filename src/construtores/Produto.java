package construtores;

public class Produto {
    String nome;
    int qantidadeEmEstoque;
    double valor;

    Produto(){
        System.out.println("Construtor padrão");

    }

    public Produto(String nome, int qantidadeEmEstoque, double valor) {
        this.nome = nome;
        this.qantidadeEmEstoque = qantidadeEmEstoque;
        this.valor = valor;
        System.out.println("Contrutor com parâmetros");
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        System.out.println("sobrecarga de construtor");
    }
}
