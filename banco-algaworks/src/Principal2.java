import com.algaworks.banco.ContaComum;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        ContaComum conta = new ContaComum();
        conta.setTitular(new Titular("Elaine Cruz", "012.345.678-90"));
        conta.setAgencia(1425);
        conta.setNumeroConta(107333);
        conta.setTipo(ContaComum.INVESTIMENTO);

        conta.imprimirDemonstrativo();
        System.out.println();
        System.out.println();

        conta.depositar(200);
        conta.imprimirDemonstrativo();

        conta.sacar(150);
        conta.imprimirDemonstrativo();

        conta.creditarInvestimentos(35);
        conta.imprimirDemonstrativo();
    }
}
