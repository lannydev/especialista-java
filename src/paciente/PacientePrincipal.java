package paciente;

import java.util.Scanner;

public class PacientePrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculadoraImc paciente = new CalculadoraImc();
        System.out.println("Informe seu peso");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();


        IndiceMassaCorporal meuImc = paciente.calcular(peso, altura);


        sc.close();

    }
}
