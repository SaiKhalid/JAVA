package tP_19_01.exo2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exo2Main {
    public static void main(String[] args) {
        HashSet<String> listeEmails = new HashSet<>();
        listeEmails.add("christian.lisangola@gmail.com");
        listeEmails.add("jean.paul@gmail.com");
        listeEmails.add("alain@gmail.com");
        listeEmails.add("lydie@yahoo.fr");
        listeEmails.add("josephine.lajoie@yahoo.com");
        listeEmails.add("luise@hotmail.fr");
        listeEmails.add("philemon.turion@gmail.com");
        listeEmails.add("jules.cesar@hotmail.fr");
        System.out.println(listeEmails);
        var occured = occurences(String.valueOf(listeEmails));
        System.out.println(occured);


    }
    static String occurences(String email) {
        Map<String, Integer> occurSuffix = new HashMap<>();
        String occured;
        String suffix = "gmail";
        String[] strToArr = email.split("[@\\.]");
        for (String word : strToArr) {

            if (occurSuffix.containsKey(word)) {
                occurSuffix.put(word, occurSuffix.get(word) + 1);
            } else {
                occurSuffix.put(word, 1);
            }
        }

        return String.valueOf(occurSuffix);
    }
}
