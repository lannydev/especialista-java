package funcionarios;

public class Pesquisador {

    public static Funcionario obterPorNome(Funcionario[] funcionarios, String nome){
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getNome().equals(nome)){
                return funcionario;
            }
        }
        throw new RuntimeException("Funcionário não encontrato pelo nome");
    }

}
