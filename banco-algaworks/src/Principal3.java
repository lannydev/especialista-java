import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {

        Titular titular = new Titular("Elaine Cristina", "109.876.543-21");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1425, 10733, 12.5);

        Conta conta = (Conta) contaEspecial;

        ContaInvestimento contaInvestimento = (ContaInvestimento)contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(contaEspecial == conta);

        System.out.println(contaInvestimento.getClass().getName());

    }
}
