package Learning;

import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {

        int[] mass = new int[]{10, 5, 7, 0, 1, 6, 4};
        bubbleSortV1(mass);
    }

    public void emptyMethod() {
    }


    public static void bubbleSortV1(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x] > arr[x+1]) {
                    isSorted = false;
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortV2(int[] arr) {
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

}
