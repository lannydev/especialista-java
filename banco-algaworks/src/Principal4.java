import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {
        Titular titular = new Titular("Elaine Cruz", "111.222.333-44");
        Conta contaInvestimento = new ContaSalario(titular, 1425, 1073,3383.5);
    }
}
