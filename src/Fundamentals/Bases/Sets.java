package Fundamentals.Bases;

import java.util.ArrayList;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        ArrayList<Integer> notes = new ArrayList<Integer>();
        notes.add(11);
        notes.add(11);
        notes.add(11);
        notes.add(11);
        notes.add(11);

        System.out.println(notes);

        HashSet<Integer> nombres2=new HashSet<>();
        nombres2.add(1);
        nombres2.add(2);
        nombres2.add(3);
        nombres2.add(3);
        nombres2.add(1);
        System.out.println(nombres2);

    }
}
