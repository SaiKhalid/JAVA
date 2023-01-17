package Fundamentals;

import java.util.Scanner;

public class OperateursLogiques {
    public static void main(String[] args) {

        // ET/AND = &&
        // OU/OR : //
        var input = new Scanner(System.in);

        System.out.print("Veuillez entrer le montant que vous pouvez payer pour un abonnement :");
        var montant = input.nextDouble();
        // Entre 5 et 10 euros, le service offert est le Premium
        // Entre 11 et 20 euros, le service offert est le Premium plus
        // Entre 21 et 30 euros, le service offert est le Platinum
        // Entre 31 et 40 euros, le service offert est le Gold
        // plus que 41 euros, le service offert est le Diamond
        if (montant>=5 && montant<=10){
            System.out.println("Votre subscription est : 'Premium'");
        }else if (montant>=11 && montant<=20){
            System.out.println("Votre subscription est : 'Premium Plus'");
        }else if (montant>=21 && montant<=30){
            System.out.println("Votre subscription est : 'Platinum'");
        }else if (montant>=31 && montant<=40){
        System.out.println("Votre subscription est : 'Gold'");
        }else if (montant>=41 ){
        System.out.println("Votre subscription est : 'Diamond'");
        }else if (montant<5 ){
        System.out.println("Le service est payant.");
        }
    }
}
