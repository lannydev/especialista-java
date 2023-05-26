package produto;

public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    void imprimirPrecoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }


}
