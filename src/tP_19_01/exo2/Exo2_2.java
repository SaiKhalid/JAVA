package tP_19_01.exo2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exo2_2 {
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
        var occured = Exo2_2.occurences(listeEmails);
        System.out.println(occured);
    }
    static String occurences(HashSet<String> listeEmails) {
        HashMap<String, Integer> occurSuffix = new HashMap<>();
        for(String email : listeEmails) {
            int debut = email.indexOf("@") + 1;
            int fin = email.lastIndexOf(".");
            if (debut> 0 && fin > 0) {
                String domainName = email.substring(debut, fin);
                if (occurSuffix.containsKey(domainName)) {
                    occurSuffix.put(domainName, occurSuffix.get(domainName) + 1);
                } else {
                    occurSuffix.put(domainName, 1);
                }
            }
        }
        return String.valueOf(occurSuffix);
    }
}
