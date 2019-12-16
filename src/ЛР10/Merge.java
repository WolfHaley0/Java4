package ЛР10;
import java.util.Scanner;
import java.util.Random;

public class Merge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int s = scan.nextInt();
        Merge mrg = new Merge();
        int[] arrA = new int[s];

        RandomS(arrA, s);

        int [] result = mrg.sortArray(new int[s]);
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
    }


    public int [] sortArray(int[] arrA){ // передача сортировки в функцию (кладём массив для сортировки)

        if (arrA.length <= 1){ // проверка\деление
            return arrA; // возврат в рекурсию
        }

        int hlflen = arrA.length / 2; //половина

        // копирование левой части от начала до середины
        int [] arrL = new int [arrA.length / 2];
        System.arraycopy(arrA, 0, arrL, 0, hlflen);

        // Копирование правой части от середины до конца, вычитание правой части
        int [] arrR = new int[arrA.length - hlflen];
        System.arraycopy(arrA, arrL.length, arrR, 0, arrR.length);

        sortArray(arrL);
        sortArray(arrR);


        return arrA;
    }

    public int [] mergeArray(int [] arrA, int [] arrL) { //сливка двух массивов в один

        int [] sliV = new int [arrA.length + arrL.length];
        int A = 0;
        int L = 0;

        for (int i = 0; i < sliV.length; i++) {
            if (A == arrA.length) {
                sliV[i] = arrL[L];
                L++;
            } else if (L == arrL.length) {
                sliV[i] = arrA[A];
                A++;
            } else if (arrA[A] < arrL[L]) {
                sliV[i] = arrA[A];
                A++;
            } else {
                sliV[i] = arrL[L];
                L++;
            }
        }
        return sliV;
    }
    public static void RandomS(int [] arrA, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arrA[i] = rand.nextInt(10);
        }
    }
}
