package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la frase");
        String frase = teclat.nextLine();
        int contador=0;
        String[] caracters = frase.split("");
        for (int i = 0; i <caracters.length; i++) {
            String caracter = caracters[i];
            if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I")
		|| caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
                contador++;
            }
        }
        System.out.println("A la frase hi ha "+contador+" vocals.");
    }
}
