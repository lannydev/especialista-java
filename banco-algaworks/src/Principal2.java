import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("Elaine", "12345678910");
        Conta conta = new Conta(titular, 1425, 1073338);
        //conta.setTipo(Conta.ESPECIAL);

        conta.imprimirDemonstrativo();
        System.out.println();
        System.out.println();

        conta.depositar(200);
        conta.imprimirDemonstrativo();

        conta.sacar(150);
        conta.imprimirDemonstrativo();

        //conta.creditarInvestimentos(35);
        conta.imprimirDemonstrativo();


        System.out.println("Sua conta: " + conta);
    }
}
