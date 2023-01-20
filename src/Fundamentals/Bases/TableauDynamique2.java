package Fundamentals.Bases;

import java.util.ArrayList;
import java.util.Scanner;

public class TableauDynamique2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notes;

        do {
            System.out.println("entrez le nombre des notes :");
            notes = input.nextInt();
            if (notes>0){
                break;
            }
            System.out.println("introduisez un nombre positif.");

        }while (true);

        ArrayList<Double> notesCours = new ArrayList<Double>();

        for (int i = 0; i < notes; i++) {
            do {
                System.out.println("entrez la note " +i+1+" :");
                var noteAInserer = input.nextDouble();
                if (noteAInserer >= 0 && noteAInserer <= 20 ){
                    notesCours.add(noteAInserer);
                    break;
                }
                System.out.println("la note doit etre entre 0 et 20");
            }while (true);

        }
        System.out.println(notesCours);

        var somme =0.0 ;

        for (int i=0 ; i<notesCours.size();i++) somme += notesCours.get(i);
        double moyenne =somme/notes;

        System.out.printf("nombre de notes: %d\n",notes);
        System.out.printf("somme : %.1f\n",somme);
        System.out.printf("moyenne: %.1f/20",moyenne);
    }
}
