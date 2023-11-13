package com.company;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<String>();
        studenti.add("David");
        studenti.add("Tamas");
        studenti.add("George");

        int nr = 2;

        for (int i = 1; i <= studenti.size(); i++) {
            if (i == nr) {
                studenti.set(i,"Mama");
                studenti.remove(i);
            }

        }
        System.out.println(studenti);
    }
}
