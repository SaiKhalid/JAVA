import java.util.Arrays;

public class Tableau {
    public static void main(String[] args) {
        double[] notesExam = {12, 12, 13, 9};

        for (int i=0;i<=3;i++){
            System.out.println(notesExam[i]);
        }
        double sommeNotes =0;
        for (int i=0;i<notesExam.length;i++){

            sommeNotes=sommeNotes+notesExam[i];
            }
        double moyenne =sommeNotes/notesExam.length;
        System.out.printf("nombre de notes: %d\n",notesExam.length);
        System.out.printf("somme : %.1f\n",sommeNotes);
        System.out.printf("moyenne: %.1f",moyenne);

        int[] nombres=new int[4];// {0,0,0,0}
        nombres[0]=12;// {12,0,0,0}
        nombres[1]=17;// {12,17,0,0}
        nombres[2]=23;// {12,17,23,0}
        nombres[3]=40;// {12,17,23,40}

    }
}
