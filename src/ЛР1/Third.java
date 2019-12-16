package ЛР1;

public class Third {
    public static void main (String [] args) {
        // задать массив
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        // числа меньше 6 умножить на 2 циклом
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}