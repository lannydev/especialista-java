package agenda;

public class Principal {
    public static void main(String[] args) {

        Horario horario = new Horario(10, 50);
        Agendamento agendamentoCorteDeCabelo = new Agendamento(horario, "Corte de cabelo em camadas");

        horario.setHora(12);
        horario.setMinuto(35);
        Agendamento agendamentoEscovaIndiana = new Agendamento(horario, "Hidratação com escova e finalização com prancha");

        imprimir(agendamentoCorteDeCabelo);
        imprimir(agendamentoEscovaIndiana);


        }

        private static void imprimir(Agendamento agendamento){
        System.out.printf("%s ás %s%n",agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }


}
