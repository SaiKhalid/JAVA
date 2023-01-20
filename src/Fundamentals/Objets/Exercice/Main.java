package Fundamentals.Objets.Exercice;

import Fundamentals.Objets.Avion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calcul mesures = new Calcul();
        System.out.print("Introduisez la longueur : ");
        mesures.setLongueur (input.nextInt());
        System.out.print("Introduisez la largeur : ");
        mesures.setLargeur (input.nextInt());
        int perimetre = mesures.calculerPerimetre();
        int surface = mesures.calculerSurface();




//        int perimetre = (mesures.getLargeur()+ mesures.getLongueur())*2;
//        int surface = mesures.getLargeur()* mesures.getLongueur();
        System.out.printf("Le périmètre = %d\nLa surface = %d",perimetre, surface);

    }
}
