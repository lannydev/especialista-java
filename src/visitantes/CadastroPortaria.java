package visitantes;

public class CadastroPortaria {

    void cadastrar(Visitante visitante, final int tempoDeExpiraçãoEmMeses){
        final int tempoDeExpiracaoEmDias = tempoDeExpiraçãoEmMeses * 30;

        System.out.printf("Acesso para o visitante %s cadastrado por %d dias",
                visitante.nome, tempoDeExpiracaoEmDias);

    }
}
