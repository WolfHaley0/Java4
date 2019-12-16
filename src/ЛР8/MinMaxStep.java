package ЛР8;
import java.util.Scanner;


public class MinMaxStep {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимум, максимум и кол-во шагов: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        for (int i = a; i <= b; i += c) {
            System.out.println(" result = " + i);
        }
    }
}
