package Fundamentals;

import java.util.Scanner;

public class ConditionLanguages {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Veuillez entrer une langue : ");
        String langue = input.nextLine();
        langue = langue.toLowerCase(); //met toutes les lettres en minuscules.

        if (langue.equals ("français")){
            System.out.println("Bonjour");
        }else if (langue.equals ("anglais")){
            System.out.println("Hello");
        }else if (langue.equals ("allemand")){
            System.out.println("Halo");
        }else if (langue.equals ("espagnol")){
            System.out.println("Hola");
        }else{
            System.out.println("ta langue n'est pas supportée.");
        }

        //switch (langue) {
            //case "français" -> System.out.println("Bonjour");
            //case "anglais" -> System.out.println("Hello");
            //case "allemand" -> System.out.println("Halo");
            //case "espagnol" -> System.out.println("Hola");
            //default -> System.out.println("ta langue n'est pas supportée.");
        //}
    }
}
