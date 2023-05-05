package paciente;

public class PacientePrincipal {
    public static void main(String[] args) {
        CalculadoraImc paciente = new CalculadoraImc();


        IndiceMassaCorporal meuImc = paciente.calcular(72.5, 1.65);

    }
}
