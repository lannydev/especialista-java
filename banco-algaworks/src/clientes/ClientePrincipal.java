package clientes;

public class ClientePrincipal {
    public static void main(String[] args) {
        String[] nomes = {"Elaine", "Diego", "Lara"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente [] clientes = {
                new Cliente("LC Personalizados e Variedades", 2_000_000),
                new Cliente("L.Cruz Cosméticos", 25_000_000),
                new Cliente("L.C Artes", 3_000_000),
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
