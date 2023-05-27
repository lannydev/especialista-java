package wrappers;

public class Principal2 {
    public static void main(String[] args) {

        Integer diasDoMês= Integer.valueOf(30);

        // pode ser feito de forma literal também, pois o próprio compilador faz a concersão;
        Integer diaDoMes = 25;


        //comparando wrhappers

        // neste exemplo vai dar false, pois não está comparando o valor e sim o endereço de memória onde o cache vai até 127
        Integer num1 = 128;
        Integer num2 = 128;
        System.out.println(num1 == num2);

        //agora neste exemplo vai dar true, pois neste caso há comparação de valor e não de memória;
        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3.equals(num4));

        //comparando valores iguais de objetos de tipos diferentes
        Integer num5 = 130;
        Short num6 = 130;
        System.out.println(num5.shortValue() == num6.shortValue());

    }
}
