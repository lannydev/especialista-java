public class carroPrincipal {
    public static void main(String[] args) {
        Carro carro  = new Carro();
        Carro carro2 = new Carro();

        carro.setFabricante("Fiat");
        carro.setModelo("Cronos");
        carro.setAnoFabricacao(2019);
        carro.setCor("cinza");

        carro.proprietario = new Proprietario();
        carro.proprietario.nome = "Elaine";
        carro.proprietario.cpf = "123,456,789-10";
        carro.proprietario.anoNascimento = 1986;

        System.out.println(carro.getFabricante());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getAnoFabricacao());
        System.out.println(carro.proprietario.nome);
        System.out.println(carro.proprietario.cpf);
        System.out.println(carro.proprietario.anoNascimento);

    }
}

