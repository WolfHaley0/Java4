package ЛР1;

public class Five {
    public static void main (String [] args) {
        int [] arr = {1,9,5,44,0};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min >arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(min + "  -  " + max);
    }
}
