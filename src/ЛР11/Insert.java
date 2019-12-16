package ЛР11;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Insert {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int s = scan.nextInt();
        int[] array = new int [s];
        RandomS(array, s);

        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            int value = array[left];// Вытаскиваем значение элемента
            int i = left - 1; // Перемещение по элементам, перед вытащенным элементом
            for (; i >= 0; i--) {

                if (value < array[i]) { // Если вытащили меньший, то передвигаем больший элемент дальше
                    array[i + 1] = array[i];
                } else {
                    break; // Если вытащенный элемент больше — останавливаемся
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Время выполнения в 'нс' = ");
        System.out.println(System.nanoTime());
    }

    public static void RandomS(int [] array, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
        }
    }
}
