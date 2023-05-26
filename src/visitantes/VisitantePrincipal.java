package visitantes;

public class VisitantePrincipal {
    public static void main(String[] args) {
        var visitante = new Visitante();
        visitante.nome = "Elaine";
        visitante.idade = 20;

        if (visitante.possuiRestricaoDeAcesso()){
            System.out.printf("Acesso não permitido para menores de %d anos",
                    Visitante.IDADE_MINIMA_PARA_ACESSO);
        }else {
            System.out.println("Acesso liberado");
            var cadastroPortaria = new CadastroPortaria();
            cadastroPortaria.cadastrar(visitante, 2);

        }



    }
}
