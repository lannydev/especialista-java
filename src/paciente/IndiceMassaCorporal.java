package paciente;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    boolean estaComObedidade(){
        return resultado >=30;
    }

    boolean estaAbaixoDoPesoIdeal(){
        return resultado < 18.5;
    }


}
