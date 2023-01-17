import java.util.HashMap;
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

        HashMap<Integer, Integer> frequence = new HashMap<>();

        for (int i = 0; i < tableau.length; i++) {
            if (frequence.containsKey(tableau[i])) {
                int count = frequence.get(tableau[i]);
                frequence.put(tableau[i], count + 1);
            } else {
                frequence.put(tableau[i], 1);
            }
        }

        int maxElement = tableau[0];
        int maxApparition = 1;

        for (int i : frequence.keySet()) {
            if (frequence.get(i) > maxApparition) {
                maxElement = i;
                maxApparition = frequence.get(i);
            }
        }

        System.out.println("l'élément le plus fréquent : " + maxElement);
        System.out.println("cet élément apparait : " + maxApparition);
    }
}
