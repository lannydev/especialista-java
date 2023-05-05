package paciente;

public class Paciente {
    double peso;
    double altura;

    IndiceMassaCorporal calcularImc(){

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = peso;
        imc.altura = altura;
        imc.resultado = peso / (altura * altura);

        if (imc.estaComObedidade() ) {
            System.out.printf("Seu IMC é: %2f, caracteriza Obesidade ", imc.resultado);
            return imc;
        }else if (imc.estaAbaixoDoPesoIdeal()){
            System.out.printf("Seu IMC é: %2f, significa que está abaixo do peso ideal", imc.resultado);
            return imc;
        }
        System.out.printf("Seu IMC é: %2f ", imc.resultado);
        return imc;

    }


}
