package ЛР8;
import java.util.Scanner;

// Вычислить факториал введенного числа.

public class Factorial {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scan.nextInt();
        System.out.println("n! равен = " + calculateFactorial(n));
    }

    static int calculateFactorial (int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }
        return result;
    }
}
