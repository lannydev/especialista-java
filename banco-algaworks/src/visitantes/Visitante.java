package visitantes;

public class Visitante {
    static final int IDADE_MINIMA_PARA_ACESSO = 18;

    String nome;
    int idade;

    boolean possuiRestricaoDeAcesso(){
        return idade < IDADE_MINIMA_PARA_ACESSO;
    }

}
