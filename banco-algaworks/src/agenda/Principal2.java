package agenda;

public class Principal2 {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 35);

        Agendamento agendamentoUnha = new Agendamento(horario, "Agendamento de manutenção de unha em gel");

        Horario novoHorario = CalculadoraHorário.somarDuasHoras(horario);

        System.out.println("Feito o " + agendamentoUnha.getDescricao() + " às " + agendamentoUnha.getHorarioFormatado());
        System.out.println("Agendamento atualizado para as " + novoHorario.formatar());
    }

}
