package tP2_17_01;

import java.util.Scanner;

public class Exo1_17_01 {
    public static void main(String[] args) {
// 1. Demander de spécifier le nombre de notes à saisir
// 2. Saisir les notes à partir du clavier en sachant que les notes doivent se situer
// entre 0 et 20
// 3. Afficher la somme
// 4. Afficher la moyenne

        Scanner input = new Scanner(System.in);

        System.out.println("introduisez le nombre des notes :");

        int n = input.nextInt();

        double[] notes=new double[n];// {0,0,0,0}
        int i =0;


        for (i=0;i<n;i++){
            System.out.print("Introduisez une note :");
            double note = input.nextDouble();
            if (note >= 0 && note <= 20) {
                notes[i] = note;
            } else {
                System.out.print("La note doit être entre 0 et 20");
                i--;
            }
        }

        for (i=0;i<n;i++){
            System.out.println("note " + (i+1) + " : " +notes[i] +"/20");
        }

        double sommeNotes =0;
        for ( i=0;i<notes.length;i++) sommeNotes += notes[i];
        double moyenne =sommeNotes/notes.length;
        System.out.printf("nombre de notes: %d\n",notes.length);
        System.out.printf("somme : %.1f\n",sommeNotes);
        System.out.printf("moyenne: %.1f/20",moyenne);
    }
}
