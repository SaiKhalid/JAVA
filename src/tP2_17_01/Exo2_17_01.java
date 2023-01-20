package tP2_17_01;
import java.util.Scanner;

public class Exo2_17_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("introduisez le nombre des colonnes :");
        int n = input.nextInt();

        int[] tableau=new int[n];
        System.out.println("introduisez les colonnes :");
        for (int i=0;i<n;i++){
            int colonne = input.nextInt();
            tableau[i] = colonne;
        }

        int maxElement = tableau[0];
        int maxApparition = 1;

        for (int i = 0; i < tableau.length; i++) {
            int count = 0;
            for (int j = 0; j < tableau.length; j++) {
                if (tableau[j] == tableau[i]) {
                    count++;
                }
            }
            if (count > maxApparition) {
                maxElement = tableau[i];
                maxApparition = count;
            }
        }

        System.out.println("l'élément le plus fréquent : " + maxElement);
        System.out.println("cet élément apparaisse : " + maxApparition + " fois");
    }
}

