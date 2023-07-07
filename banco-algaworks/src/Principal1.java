import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("Elaine", "123.456.789-10");
        Conta conta = new Conta(titular, 1425, 1073338);


        conta.imprimirDemonstrativo();
        System.out.println();
        System.out.println();

        conta.depositar(200);
        conta.imprimirDemonstrativo();

        conta.sacar(150);
        conta.imprimirDemonstrativo();

       // conta.creditarInvestimentos(20);

        //conta.setTaxaConta(10);

        System.out.println("Sua conta: " + conta);
    }
}
