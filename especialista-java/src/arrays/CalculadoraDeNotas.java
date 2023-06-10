package arrays;

public class CalculadoraDeNotas {

    static double calcularMedia(double[] numeros){
        double total = 0;

        for (double numero: numeros) {
            total += numero;

        }

        /*for (int i = 0; i < numeros.length; i++) {

        }*/


        return total / numeros.length;
    }
}
