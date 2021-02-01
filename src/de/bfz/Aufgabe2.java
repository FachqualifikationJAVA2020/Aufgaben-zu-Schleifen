package de.bfz;

public class Aufgabe2 {

    public static void main(String[] args) {

        String piep = "piep";
        for(int i = 1; i < 21; i = i + 1){
            if(i % 3 == 0){
                System.out.println(piep);
            }else{
                System.out.println(i);
            }
        }
    }
}
