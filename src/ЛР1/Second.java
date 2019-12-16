package ЛР1;

public class Second {
    public static void main (String [] args){
        //пустой массив с размером 8
        int[] arr = new int [8];
        // цикл с присваиванием
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
            System.out.print(arr[i] + " ");
        }
    }
}
