package compras.servicos;

import compras.Cartao;
import compras.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        //TODO faz cobrança via Pix


        cartao.debitar(valorDeposito);

        return new Recibo(cartao.getNomeTitular(), "Depósito", valorDeposito);

    }
}
