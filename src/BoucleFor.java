public class BoucleFor {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int nombre = 2;nombre<=100; nombre++){
            System.out.printf("Le carré de %d est %.1f\n",nombre,Math.pow(nombre,2));
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " ns");
    }
}
