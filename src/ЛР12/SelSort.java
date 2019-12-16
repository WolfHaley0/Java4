package ЛР12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelSort {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int s = scan.nextInt();
        int[] arr = new int [s];
        Random(arr, s);

        System.out.println(Arrays.toString(arr));
        for (int lftvlue = 0; lftvlue < arr.length; lftvlue++) {
            int min = lftvlue;
            for (int i = lftvlue; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int swp = arr[lftvlue];
            arr[lftvlue] = arr[min];
            arr[min] = swp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Время выполнения в 'нс' = ");
        System.out.println(System.nanoTime());
    }

    public static void Random(int [] array, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
        }
    }
}
