// a variável não armazena o objeto, a variável referencia o objeto

public class carroPrincipal {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario();

        Carro carro  = new Carro();
        Carro carro2 = new Carro();

        carro.setFabricante("Fiat");
        carro.setModelo("Cronos");
        carro.setAnoFabricacao(2019);
        carro.setCor("cinza");
        carro.setAnoAtual(2023);
        carro.setPrecoCompra(85000.00);

        carro.proprietario = proprietario1;
        carro.proprietario.nome = "Elaine";
        carro.proprietario.cpf = "123.456.789-10";
        carro.proprietario.anoNascimento = 1986;

        double meuvalorRevenda = carro.calcularValorRevenda();

        System.out.println(carro.getFabricante());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getAnoFabricacao());
        System.out.println(carro.proprietario.nome);
        System.out.println(carro.proprietario.cpf);
        System.out.println(carro.proprietario.anoNascimento);

        System.out.printf("Tempo de uso (anos): %d%n", carro.getAnoAtual() - carro.getAnoFabricacao());
        System.out.printf("Valor de revenda: %6.2f%n", meuvalorRevenda);


    }
}

