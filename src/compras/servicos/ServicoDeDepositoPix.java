package compras.servicos;

import compras.Cartao;
import compras.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        //TODO faz cobrança via Pix
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor do depósito não pode ser inferior a %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.nomeTitular, "Depósito", valorDeposito);

    }
}
