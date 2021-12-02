package com.edvallejo;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 122;
        numbers[1] = 12;
        numbers[2] = 45;
        numbers[3] = 4;
        numbers[4] = 70;
        numbers[5] = 1;
        numbers[6] = 72;
        numbers[7] = 80;
        numbers[8] = 88;
        numbers[9] = 90;

        // Ascending Order:
        bubbleSortAscending(numbers);
        selectionSortAscending(numbers);

        // Descending Order:
        bubbleSortDescending(numbers);
        selectionSortDescending(numbers);

        printArrayElements(numbers);
    }
    private static void bubbleSortDescending(int[] arr){
        for(int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--){
            for (int i = 0; i < lastIndex; i++){
                if (arr[i] < arr[i +1]){
                    int temporary = arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temporary;
                }
            }
        }
    }
    private static void selectionSortDescending(int[] arr){
        for(int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--){
            int smallest = 0;

            for(int i = 1; i <= lastIndex; i++){
                if(arr[i] <= arr[smallest]){
                    smallest = i;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
    private static void bubbleSortAscending(int[] arr){
        for(int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--){
            for (int i = 0; i < lastIndex; i++){
                if (arr[i] > arr[i +1]){
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    private static void selectionSortAscending(int[] arr){
        for(int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--){
            int largestIndex = 0;

            for(int i = 1; i <= lastIndex; i++){
                if(arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }
            }

            int temp = arr[lastIndex];
            arr[lastIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr){
        for(int j: arr){
            System.out.println(j);
        }
    }
}
