import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;

public class Exo4_17_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("introduisez le nombre des colonnes pour le 1er tableau:");
        int n1 = input.nextInt();
        int[] tableau1 = new int[n1];
        System.out.println("introduisez les colonnes pour le 1er tableau:");
        for (int i = 0; i < n1; i++) {
            int colonne1 = input.nextInt();
            tableau1[i] = colonne1;
                    }
        System.out.println("Le 1er tableau est : " + Arrays.toString(tableau1));

        System.out.print("introduisez le nombre des colonnes pour le 2eme tableau:");
        int n2 = input.nextInt();
        int[] tableau2 = new int[n2];
        System.out.println("introduisez les colonnes pour le 2eme tableau:");
        for (int i = 0; i < n2; i++) {
            int colonne2 = input.nextInt();
            tableau2[i] = colonne2;
        }
        System.out.println("Le 2eme tableau est : " + Arrays.toString(tableau2));
        System.out.print("introduisez le nombre des colonnes pour le 3eme tableau:");
        int n3 = input.nextInt();
        int[] tableau3 = new int[n3];
        System.out.println("introduisez les colonnes pour le 3eme tableau:");
        for (int i = 0; i < n3; i++) {
            int colonne3 = input.nextInt();
            tableau3[i] = colonne3;
        }
        System.out.println("Le 3eme tableau est : " + Arrays.toString(tableau3));


        int sum1 = 0;
        for (int i = 0; i < n1; i++) {
            if(tableau1[i]%3==0){
                sum1 += tableau1[i];
            }
        }
        System.out.println("La somme des éléments divisibles par 3 dans le 1er tableau est: " + sum1);

        int sum2 = 0;
        for (int i = 0; i < n2; i++) {
            if(tableau2[i]%3==0){
                sum2 += tableau2[i];
            }
        }
        System.out.println("La somme des éléments divisibles par 3 dans le 2eme tableau est: " + sum2);

        int sum3 = 0;
        for (int i = 0; i < n3; i++) {
            if(tableau3[i]%3==0){
                sum3 += tableau3[i];
            }
        }
        System.out.println("La somme des éléments divisibles par 3 dans le 3eme tableau est: " + sum3);
        System.out.println("La somme des éléments divisibles par 3 dans le 3 tableaux est: " + (sum1+sum2+sum3));

    }
}
