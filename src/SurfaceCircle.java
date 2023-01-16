import java.util.Scanner;

public class SurfaceCircle {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Introduit le diamètre :");
        double diametre = keyboardInput.nextInt();
        var rayon = diametre/2;
        System.out.println("le rayon est : " + rayon);
        var surface = Math.PI * Math.pow(rayon,2)  ;
        System.out.println("la surface du circle est : " + surface);

    }
}
