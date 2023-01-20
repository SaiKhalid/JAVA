package tP_18_01;

import java.util.HashMap;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez le mot : ");
        var phrase = "je suis  dans une joie immense  .";
        char[] phraseChars = phrase.toCharArray();
        //var phrase = scanner.nextLine();



// Faire une boucle sur le string :
        for (int i = 0; i < phraseChars.length - 1; i++) {

            if (phraseChars[i] == ' ') {
                phraseChars[0] = Character.toUpperCase(phraseChars[0]);
                phraseChars[i+1] = Character.toUpperCase(phraseChars[i+1]);
                }
        }
        System.out.println(String.valueOf(phraseChars));
    }
}
