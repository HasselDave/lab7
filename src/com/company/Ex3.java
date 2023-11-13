package com.company;
import java.util.*;

public class Ex3 {
public static void main(String[] args){
    Map<Integer, String> hm2 = new HashMap<>();

    hm2.put(1,"David");
    hm2.put(2,"Tamas");
    hm2.put(3,"George");

    System.out.println(hm2);

    hm2.put(2,"Matei");

    System.out.println(hm2);

    hm2.remove(2);

    System.out.println(hm2);



    }
}
