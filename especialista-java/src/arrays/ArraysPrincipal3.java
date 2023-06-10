package arrays;

import java.util.ArrayList;

public class ArraysPrincipal3 {
    public static void main(String[] args) {
        ArrayList<String>nome = new ArrayList<>();

        nome.add("Elaine");
        nome.add("Lara");

        for (int i = 0; i < nome.size(); i++) {
            String name = nome.get(i);
            System.out.println(name);

        }

        for(String name: nome){
            System.out.println(name);
        }
    }
}
