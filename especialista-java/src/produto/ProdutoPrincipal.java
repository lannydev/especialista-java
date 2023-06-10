package produto;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto.custoEmbalagem = 2.5;

        produto1.precoCusto = 400.00;
        produto2.precoCusto = 501.20;

        ServicoPrecificacao servicoPrecificacao = new ServicoPrecificacao();
        servicoPrecificacao.definirPrecoVenda(produto1, 20.2);

        ServicoPrecificacao servicoPrecificacao2 = new ServicoPrecificacao();
        servicoPrecificacao2.definirPrecoVenda(produto2, 21.0);

        System.out.println("Preço de venda do produto 1: " + produto1.precoVenda);
        System.out.println("Preço de venda do produto 2: " + produto2.precoVenda);

        produto1.imprimirPrecoEmbalagem();
        produto2.imprimirPrecoEmbalagem();

    }
}
