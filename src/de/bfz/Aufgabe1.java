package de.bfz;

public class Aufgabe1 {

    public static void main(String[] args) {
	    //Aufgabe A
        System.out.println("AUFGABE A");
        for(int i = 0; i < 3; i = i + 1){
            if(i == 0){
                System.out.println("*");
            }
            if(i == 1){
                System.out.println("**");
            }
            if(i == 2){
                System.out.println("***");
            }
        }
        System.out.println();


        // Weg mit zwei Schleifen
        System.out.println("Mit zwei Schleifen");
        for(int i = 0; i < 1; i = i + 1){
            System.out.println("*");
            for(int j = 0; j < 1; j = j + 1) {
                System.out.println("**");
            }
        }
        System.out.println("***");
        System.out.println();


        // Alternativer weg mit zwei Schleifen
        System.out.println("Alternativer weg mit zwei Schleifen");
        for (int i = 1; i <= 3; i = i + 1) {
            for (int j = 1; j <= i; j = j + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Aufgabe B
        System.out.println("AUFGABE B");
        for(int i = 0; i < 5; i = i + 1){
            if(i == 0){
                System.out.println("  *  ");
            }
            if(i == 1){
                System.out.println(" *** ");
            }
            if(i == 2){
                System.out.println("*****");
            }
            if(i == 3){
                System.out.println(" *** ");
            }
            if(i == 4){
                System.out.println("  *  ");
            }
        }
        System.out.println();

        // Alternativer weg mit noch mehr Schleifen
        System.out.println("Alternativer weg mit noch mehr Schleifen");
        for(int i = 0; i < 1; i = i + 1) {
            System.out.println("  *  ");
            for (int j = 0; j < 1; j = j + 1) {
                System.out.println(" *** ");
                for (int k = 0; k < 1; k = k + 1) {
                    System.out.println("*****");
                }
            }
        }
        for(int i = 0; i < 1; i = i + 1){
            System.out.println(" *** ");
            for(int j = 0; j < 1; j = j + 1){
                System.out.println("  *  ");
            }
        }
    }
}
