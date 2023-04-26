public class carroPrincipal {
    public static void main(String[] args) {
        Carro carro  = new Carro();
        Carro carro2 = new Carro();

        carro.setFabricante("Fiat");
        carro.setModelo("Cronos");
        carro.setAnoFabricacao(2019);
        carro.setCor("cinza");

        System.out.println(carro.getFabricante());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getAnoFabricacao());

    }
}

