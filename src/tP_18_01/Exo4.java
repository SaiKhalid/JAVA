package tP_18_01;

import java.util.HashMap;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer une chaîne: ");
        //String phrase = input.nextLine();
        String phrase="Je suis dans une joie immense.Et je sais que vous aussi.";
        String unique = "";
        HashMap<Character, Integer> doublons = new HashMap<>();
        for (int i = 0; i < phrase.length(); i++) {
            char lettre = phrase.charAt(i);
            if (!unique.contains(String.valueOf(lettre))) {
                unique += lettre;
            } else {
                if (doublons.containsKey(lettre)) {
                    doublons.put(lettre, doublons.get(lettre) + 1);
                } else {
                    doublons.put(lettre, 1);
                }
            }
        }
        System.out.println("La chaîne de départ fournie par l’utilisateur : " + phrase);
        System.out.println("La chaîne après suppression des doublons : " + unique);
        System.out.println("Les doublons et le nombre de fois : " + doublons);
    }
}
