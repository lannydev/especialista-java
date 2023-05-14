package paciente;

public class CalculadoraImc {


    IndiceMassaCorporal calcular(Paciente paciente){

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);

        return imc;

    }




}
