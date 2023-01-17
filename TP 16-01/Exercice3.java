import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez a : ");
        double a = input.nextDouble();
        System.out.print("Introduisez b : ");
        double b = input.nextDouble();
        System.out.print("Introduisez c : ");
        double c = input.nextDouble();

        //ax²+bx+c = 0
        //delta=b2 − 4ac
        double delta = Math.pow(b,2)-4*a*c ;
        System.out.println(delta);

        if (delta==0){
            double x0 = -(b/(2*a));
            System.out.println("L'équation a une solution unique.");
            System.out.println("x0 = " + x0);
        }else if (delta>0) {
            double x1;
            double x2;
            x1=(-(b)-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("L'équation a deux solutions distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (delta<0){
            System.out.println("L'équation n'a pas de solution réelle.");
        }

    }
}
