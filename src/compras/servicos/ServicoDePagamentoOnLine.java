package compras.servicos;

import compras.Cartao;
import compras.Estabelecimento;
import compras.Recibo;

public class ServicoDePagamentoOnLine {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        if (cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para a transação");
        }
        cartao.saldo -= valor;

        //TODO realiza outras formas de efetuar pagamento ao estabelecimento.

        return new Recibo(cartao.nomeTitular, "Pagamento", valor);

    }
}
