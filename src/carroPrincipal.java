// a variável não armazena o objeto, a variável referencia o objeto

public class carroPrincipal {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario();
        Proprietario proprietario2 = new Proprietario();

        Carro carro  = new Carro();
        Carro carro2 = new Carro();

        carro.setFabricante("Fiat");
        carro.setModelo("Cronos");
        carro.setAnoFabricacao(2019);
        carro.setCor("cinza");
        carro.setAnoAtual(2023);
        carro.setPrecoCompra(0.0);

        carro.proprietario = proprietario1;
        carro.proprietario.nome = "Elaine";
        carro.proprietario.cpf = "123.456.789-10";
        carro.proprietario.anoNascimento = 1986;

        carro2.proprietario = proprietario2;
        carro2.proprietario.nome = "Elaine";
        carro2.proprietario.cpf = "123.456.789-10";
        carro2.proprietario.anoNascimento = 1986;

        carro2.setFabricante("Fiat");
        carro2.setModelo("Mobi");
        carro2.setAnoFabricacao(2021);
        carro2.setCor("cinza");
        carro2.setAnoAtual(2023);
        carro2.setPrecoCompra(86000.0);

        double meuValorRevenda = carro.calcularValorRevenda();
        int meuTempoDeUso = carro.calcularTempoDeUsoEmAnos();
        carro.imprirResumoDepreciacao();
        carro2.imprirResumoDepreciacao();

       /* System.out.println(carro.getFabricante());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getAnoFabricacao());
        System.out.println(carro.proprietario.nome);
        System.out.println(carro.proprietario.cpf);
        System.out.println(carro.proprietario.anoNascimento);

        */





    }
}

