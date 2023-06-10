package agenda;

public class CalculadoraHorário {

    private CalculadoraHorário(){
        
    }

    public static Horario somarDuasHoras(Horario horario){
        int hora = horario.getHora() + 2;
        if (hora > 24){
            hora -= 24;
        }

        return new Horario(hora, horario.getMinuto());
    }
}
