package Fundamentals;

import java.util.Scanner;

public class codePin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int essais = 0;
        int maxEssais = 5;
        System.out.print("Enter the code pin:");
        int codePin = input.nextInt();




        do {
            if (essais < maxEssais) {
                System.out.print("Enter the code pin d'essai:");

                int pinEssai = input.nextInt();

                if (pinEssai < 1000 || pinEssai > 9999) {
                    System.out.println("code pin devrait etre composé de 4 chiffres");
                    essais++;
                    // if (essais>=3){
                    // System.out.println("il vous restes " + (5-essais)+ " essais");
                    //}

                } else if (pinEssai == codePin) {
                    System.out.println("Access granted!");
                    break;
                } else {
                    System.out.println("Access denied. Please try again.");
                    essais++;
                    //if (essais>=3){
                    //    System.out.println("il vous restes " + (5-essais)+ " essais");
                    //}
                }
                if (essais == maxEssais) {
                    System.out.println("Max essais atteint");
                } else if (essais >= 3) {
                    System.out.println("il vous restes " + (5 - essais) + " essais");

                }
            }

        } while (true);
    }
}
