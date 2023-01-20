package tP_19_01.Exo5;

import java.util.Arrays;

public class Exo5 {
    public static void main(String[] args) {
        String mot1 = "Rage";
        String mot2 = "Gare";
        var result = isAnagram("Gre", "Rage");

        if (result) {
            System.out.println(mot1 + " et " + mot2 + " sont des anagrammes");
        } else {
            System.out.println(mot1 + " et " + mot2 + " ne sont des pas anagrammes");
        }
    }

    static boolean isAnagram(String str1, String str2) {

        String phrase1 = cleanText(str1);
        String phrase2 = cleanText(str2);

        if (phrase1.length() != phrase2.length()) {
            return false;
        }
        char[] ArrayP1 = lowerCharacterArray(phrase1);
        char[] ArrayP2 = lowerCharacterArray(phrase2);
        Arrays.sort(ArrayP1); //Sorts the specified array into ascending numerical/alphabetical order.
        Arrays.sort(ArrayP2);
        return Arrays.equals(ArrayP1, ArrayP2);

    }

    static String cleanText(String text) {
        return text.replaceAll("\\s", "");
    }

    static char[] lowerCharacterArray (String phrase) {
        return phrase.toLowerCase().toCharArray();
    }

}

