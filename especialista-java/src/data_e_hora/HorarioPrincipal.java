package data_e_hora;

public class HorarioPrincipal {

    public static void main(String[] args) {

        Horario horario = new Horario(10, 55);
        // System.out.printf("%dh%dm", horario.getHora(), horario.getMinuto());
        System.out.println(horario.formatarHoraEMinuto());
    }
}
