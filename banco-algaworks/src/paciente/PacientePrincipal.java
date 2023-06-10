package paciente;

import java.util.Scanner;

public class PacientePrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente elaine = new Paciente();
        elaine.peso = 49.2;
        elaine.altura = 1.65;
        IndiceMassaCorporal meuImc = calculadoraImc.calcular(elaine);

        if (meuImc.estaComObedidade()){
            System.out.printf("Seu IMC é: %2f, caracteriza Obesidade ", meuImc.resultado);
        } else if (meuImc.estaAbaixoDoPesoIdeal()) {
            System.out.printf("Seu IMC é: %2f, significa que está abaixo do peso ideal", meuImc.resultado);

        }
        else {
            System.out.printf("Seu IMC é: %2f ", meuImc.resultado);
        }


        sc.close();

    }
}
