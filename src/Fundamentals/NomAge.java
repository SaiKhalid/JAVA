package Fundamentals;

import java.util.Scanner;

public class NomAge {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Votre nom :");
        String nom = keyboardInput.nextLine();

        System.out.println("Votre prénom :");
        String prenom = keyboardInput.nextLine();

        System.out.println("Votre age :");
        int age = keyboardInput.nextInt();


        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans", nom, prenom,age);
    }
}
