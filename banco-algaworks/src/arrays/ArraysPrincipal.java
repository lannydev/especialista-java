package arrays;

public class ArraysPrincipal {
    public static void main(String[] args) {

        //int posicaodasNotas = 4;
       // double[]notas = new double[posicaoDasNotas];

        double[] notas = new double[]{9.5, 9.0, 7.01, 5.0};
        notas[3] = 6.5;
        System.out.println(notas[3]);

        double mediaNota = CalculadoraDeNotas.calcularMedia(notas);
        System.out.println(mediaNota);







    }
}
