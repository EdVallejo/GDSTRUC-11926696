package com.edvallejo;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {60, 33, 12, 64, 17, 105, -53};
        int numbers2[] = {2, 72, 34, 21, 89, 18, 12};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        System.out.println(linearSearch(numbers, 105));
        System.out.println(linearSearch(numbers, 420));

        System.out.println(binarySearch(numbers, 33));
        System.out.println(binarySearch(numbers, 420));

        //Own Algorithm: Axie to the moon meaning pa ascending order ;P
        AxieToTheMoon(numbers);
        AxieToTheMoon(numbers2);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (input[middle] == value) {
                return middle;
            } else if (value < input[middle]) {
                end = middle - 1; //value mite be at left half
            } else if (value > input[middle]) {
                start = middle + 1; //value mite be at rite half
            }
        }
        return -1;
    }

    private static void AxieToTheMoon(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }

            int temporary = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temporary;
        }
    }
}

