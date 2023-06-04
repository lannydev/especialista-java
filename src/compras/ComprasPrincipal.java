package compras;

import compras.servicos.ServicoDeDepositoPix;
import compras.servicos.ServicoDePagamentoOnLine;

public class ComprasPrincipal {
    public static void main(String[] args) {
        var lcPersonalizadosEvariedades = new Estabelecimento("LC Personalizados e variedades");
        var cartao = new Cartao("Elaine Cruz");

        var deposito = new ServicoDeDepositoPix();
        Recibo recibo = deposito.efetuarDeposito(cartao, 250.00);
        recibo.imprimir();

        var pagamento = new ServicoDePagamentoOnLine();
        Recibo reciboPagamento = pagamento.efetuarPagamento(lcPersonalizadosEvariedades, cartao, 150.0);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.nomeTitular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);



    }
}
