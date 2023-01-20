package tP_18_01;

import java.util.HashMap;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez le mot : ");
        //var mot = "Je suis dans une joie immense.Et je sais que vous aussi";
        var mot = scanner.nextLine();

        HashMap<Character, Integer> occurences = new HashMap<>();

// Faire une boucle sur le string :
        for (int i = 0; i < mot.length(); i++) {
            var lettre = mot.toLowerCase().charAt(i);
            if (occurences.containsKey(lettre)) {
                int nombreOccurences = occurences.get(lettre);//1
                occurences.replace(lettre, nombreOccurences + 1);
            } else {
                // Si l'element n'existe pas, on l'ajoute avec comme nombre d'occurences 1
                occurences.put(lettre, 1);
            }
        }
        System.out.println(occurences);
    }
}
