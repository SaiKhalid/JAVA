package tP_18_01;

import java.util.HashMap;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez le mot : ");
        //var mot = "Je suis dans une joie immense.Et je sais que vous aussi";
        var nombre = "-271";
        char[] nombreChars = nombre.toCharArray();



// Faire une boucle sur le string :
        for (int i = 0; i < (nombreChars.length-1); i++) {
            if (nombreChars[0] != '-'){
                //var lettre = nombre.charAt(i);
                System.out.println((nombreChars[1]) +""+(nombreChars[0]));
                }else {
                System.out.println("-"+(nombreChars[2]) +""+(nombreChars[1]));

            }
//            var lettre = nombre.charAt(i);
//            System.out.println((nombre.charAt(nombre.length()-1)) +""+(nombre.charAt(nombre.length()-2)) );
        }
    }
}
