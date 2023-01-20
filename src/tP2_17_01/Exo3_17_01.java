package tP2_17_01;
import java.util.Scanner;

public class Exo3_17_01 {
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
        System.out.print("Introduisez le nombre que vous cherchez : ");
        int r = input.nextInt();
        int trouve = 0;
        boolean found = false;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] == r){
                found = true;
                trouve++;
            }
        }
        if (found == true) {
            System.out.printf("%d est present dans la liste ",r);
            System.out.println(trouve + " fois");
        } else {
            System.out.println("10 is not present in the list");
        }
    }
}
