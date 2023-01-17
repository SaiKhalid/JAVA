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
        int r =10;
        int trouve = 0;
        boolean found = false;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] == r){
                found = true;
                trouve++;
            }
        }
        if (found == true) {
            System.out.println("10 is present in the list");
            System.out.println(trouve);
        } else {
            System.out.println("10 is not present in the list");
        }
    }
}
