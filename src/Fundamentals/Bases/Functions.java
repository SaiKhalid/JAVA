package Fundamentals.Bases;

public class Functions {
    static double calculSurface(double rayon){
        return Math.pow(rayon,2)*Math.PI;
    }

    static double somme(double nombre1, double nombre2){
        return (nombre1+nombre2);
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        double surface = calculSurface(40);
        double somme = somme(4,5);
        System.out.println(somme);

        long endTime = System.nanoTime();
        long runningTime = endTime - startTime;

        System.out.println("Running time: " + runningTime + " nanoseconds");
    }
}
