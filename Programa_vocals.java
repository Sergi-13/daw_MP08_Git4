package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la frase");
        String frase = teclat.nextLine();
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorO=0;
        int contadorU=0;
        String[] caracters = frase.split("");
        for (int i = 0; i <caracters.length; i++) {
            String caracter = caracters[i];
            if (caracter.equalsIgnoreCase("A")) {
                contadorA++;
            } else if (caracter.equalsIgnoreCase("E")) {
                contadorE++;
            } else if (caracter.equalsIgnoreCase("I")) {
                contadorI++;
            } else if (caracter.equalsIgnoreCase("O")) {
                contadorO++;
            } else if (caracter.equalsIgnoreCase("U")) {
                contadorU++;
            }
        }
        System.out.println("A la frase hi ha "+contadorA+" A, "+contadorE+" E, "+contadorI+" I, "+contadorO+" O, i "+contadorU+" U.");
    }
}
