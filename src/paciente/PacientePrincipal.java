package paciente;

public class PacientePrincipal {
    public static void main(String[] args) {
        CalculadoraImc paciente = new CalculadoraImc();
        paciente.peso = 40.5;
        paciente.altura = 1.65;

        IndiceMassaCorporal meuImc = paciente.calcular();

    }
}
