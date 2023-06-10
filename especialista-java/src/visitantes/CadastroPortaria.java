package visitantes;

public class CadastroPortaria {

    static final int TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES);

    }

    void cadastrar(Visitante visitante, final int tempoDeExpiracaoEmMeses){
        final int tempoDeExpiracaoEmDias = tempoDeExpiracaoEmMeses * 30;

        System.out.printf("Acesso para o visitante %s cadastrado por %d dias",
                visitante.nome, tempoDeExpiracaoEmDias);

    }
}
