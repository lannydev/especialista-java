package arrays;

import java.util.Arrays;

public class ArraysPrincipal2 {
    public static void main(String[] args) {
        int [] numeroSenha = {12, 5, 7, 10, 15, 30, 40};

        // copia apenas as três primeiras posições.
        int [] numerosenha2 = Arrays.copyOf(numeroSenha, 3);
        System.out.println(Arrays.toString(numerosenha2));

        //copia todas as posições.
        int [] numeroSenha3 = Arrays.copyOf(numeroSenha, numeroSenha.length);
        System.out.println(Arrays.toString(numeroSenha3));

    }
}
