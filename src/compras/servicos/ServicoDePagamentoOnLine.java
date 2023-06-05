package compras.servicos;

import compras.Cartao;
import compras.Estabelecimento;
import compras.Recibo;

public class ServicoDePagamentoOnLine {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        cartao.debitar(valor);

        //TODO realiza outras formas de efetuar pagamento ao estabelecimento.

        return new Recibo(cartao.getNomeTitular(), "Pagamento", valor);

    }
}
