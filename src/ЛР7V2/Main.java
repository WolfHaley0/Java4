package ЛР7V2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main { // extends

    public static void main (String[]args){
        ArrayList<Abstrct> list = new ArrayList<Abstrct>();

        list.add(new Hour("Jack", 50.0));
        list.add(new Hour("Bob", 60.0));
        list.add(new Fix("Max", 1600.0));
        list.add(new Fix("Carl", 1500.0));
        System.out.println("Before: ");

        for (Abstrct elem : list) {
            System.out.println(elem.getName() + "-" + elem.getSalary());
            elem.GETSalary();
        }

        Collections.sort(list, new Comparator<Abstrct>() {
            @Override
            public int compare(Abstrct o1, Abstrct o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("\n" + "Sorted: ");
        for (Abstrct elem : list) {
            System.out.println(elem.getName() + "-" + elem.getSalary());
        }
    }
}
