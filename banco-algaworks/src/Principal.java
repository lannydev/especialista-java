import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular(new Titular("Elaine Cruz", "012.345.678-90"));
        conta.setAgencia(1425);
        conta.setNumeroConta(107333);

        conta.imprimirDemonstrativo();
        System.out.println();
        System.out.println(); .ç

        conta.depositar(200);
        conta.imprimirDemonstrativo();

        conta.sacar(150);
        conta.imprimirDemonstrativo();
    }
}
