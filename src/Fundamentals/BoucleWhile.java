package Fundamentals;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Veuillez définir un code PIN : ");
        var codePin=input.nextInt();

//        1. Version avec while
//        int codePinATester=1111;
//
//        while (codePinATester!=Fundamentals.codePin){
//            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
//            codePinATester=input.nextInt();
//            if(Fundamentals.codePin!=codePinATester){
//                System.out.println("Code PIN incorrect. Veuillez ressayer.");
//            }
//        }


//        2. Version avec do while

        int codePinATester;

        do{
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            codePinATester=input.nextInt();
            if(codePin!=codePinATester){
                System.out.println("Code PIN incorrect. Veuillez ressayer.");
            }
        } while (codePinATester!=codePin);
    }
}
