package com.company;
import java.util.*;

public class Ex2 {
    public static void main(String[] args){
        Set<String> carti= new HashSet<String>();
        carti.add("Carte1");
        carti.add("Carte2");
        carti.add("Carte3");
        System.out.println(carti);
        carti.remove("Carte2");
        carti.add("Carte4");
        System.out.println(carti);

    }
}
