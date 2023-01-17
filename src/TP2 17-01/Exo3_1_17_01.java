import java.util.Arrays;
import java.util.Scanner;

public class Exo3_1_17_01 {
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

        int r =10;
        boolean valeurPresente = Arrays.stream(tableau).anyMatch(x -> x == r);
        if (valeurPresente == true) {
            System.out.println("10 is present in the list");
        } else {
            System.out.println("10 is not present in the list");
        }
    }
}
