package ЛР3;
import java.util.Arrays;

public class Bubble {
    public static void main (String [] args) {
        int [] arr = {10, 3, 12, 19, 8};

        boolean isSorted = false;
        int bub;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    bub = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = bub;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}