package paciente;

public class IndiceMassaCorporal {
    double peso;
    double altura;
    double resultado;

    boolean estaComObedidade(){
        return resultado >=30;
    }

    boolean estaAbaixoDoPesoIdeal(){
        return resultado < 18.5;
    }




}
