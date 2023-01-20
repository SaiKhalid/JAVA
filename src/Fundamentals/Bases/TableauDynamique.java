package Fundamentals.Bases;

import java.util.ArrayList;

public class TableauDynamique {
    public static void main(String[] args) {
        String[] fruit = new String[]{"pomme", "banane", "orange"};
        String[] fruit2 = {"pomme", "banane", "orange"};
        String[] fruits3 = new String[3];

        ArrayList <Integer> fruits4 = new ArrayList<Integer>();

        for (int i = 0; i < fruits4.size(); i++) {
            System.out.println("les fruits : " + fruits4.get(i));
        }

//        ArrayList <String> fruits5 = fruits4;
//        for (int i = 0; i < fruits4.size(); i++) {
//            System.out.println(fruits5.get(i));
//        }
//        fruits5.add("ananas");
//
//        for (int i = 0; i < fruits4.size(); i++) {
//            System.out.println(fruits4.get(i));
//        }
//        for (int i = 0; i < fruits5.size(); i++) {
//            System.out.println(fruits4.get(i));
//        }
//        System.out.println(fruits4.size()+ " " + fruits5.size());
    }
}
