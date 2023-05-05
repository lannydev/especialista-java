package paciente;

public class PacientePrincipal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.peso = 40.5;
        paciente.altura = 1.65;

        IndiceMassaCorporal meuImc = paciente.calcularImc();

    }
}
