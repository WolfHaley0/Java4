package ЛР1;

public class Six {
    public static void main(String[] args) {
        int arr[] = {1, 1};
        System.out.println(CheckSum(arr));
    }

    public static boolean CheckSum(int[] arr) {
        int arrSum = 0;
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == arrSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}