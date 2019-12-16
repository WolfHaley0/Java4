package ЛР6;

import java.util.LinkedList;

public class Main {
    public static void main (String [] args) {

        String str1 = new String("Sup");
        String str2 = new String("2ch");
        String str3 = new String("lmao");

        LinkedList<String> elem = new LinkedList<>();
        elem.add(str1);
        elem.add(str2);
        elem.add(str3);
        System.out.println(elem);
        elem.remove(str2);
        System.out.println(elem);
    }
}
