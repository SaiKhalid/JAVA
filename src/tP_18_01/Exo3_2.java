package tP_18_01;

import java.util.HashMap;
import java.util.Scanner;

public class Exo3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez le mot : ");
        var phraseChars = "je suis dans une joie immense";
        //char[] phraseChars = phrase.toCharArray();
        //var phrase = scanner.nextLine();



// Faire une boucle sur le string :
        for (int i = 0; i < phraseChars.length() - 1; i++) {
            if (phraseChars.contains(String.valueOf(" "))) {
                String phraseCharsUp = String.valueOf(Character.toUpperCase(phraseChars.charAt(i+1)));
                System.out.println(phraseCharsUp);
            }
        }


    }
}