package tP_19_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // var language = input.nextLine();
        int nombre= 4; //input.nextInt();
        HashSet<String> langages=new HashSet<>();
        System.out.println("nombre des langages a saisir : " + nombre);
        System.out.println("Introduisez les langages ");
        for(int i=0;i<nombre;i++)
        {
            langages.add(input.nextLine().toLowerCase());
        }
        System.out.println("les langages saisis : ");
        System.out.println(langages);
        int nombreASupprimer= 2; //input.nextInt();
        System.out.println("nombre des langages a suprimer : " + nombreASupprimer);

        HashSet<String> langages1 = new HashSet<>(langages);
        for(int i=0;i<nombreASupprimer;i++)
        {
            langages1.remove(input.nextLine().toLowerCase());
        }
        System.out.println("les langages après la suppression : ");
        System.out.println(langages);
        System.out.println(langages1);
    }
}
