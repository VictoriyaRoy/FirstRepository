package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 40, 50, 70, 10, 20};

        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);

    }


    private static void bubbleSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 1; index > barrier; index--) {
                if (arr[index] < arr[index - 1]) {
                    swap(arr, index, index - 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] array) {
        for (int barrier = array.length - 1; barrier >= 0; barrier--) {
            for (int index = array.length - 1; index > barrier; index--) {
                if (array[barrier] > array[index]) {
                    swap(array, barrier, index);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int array[], int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    private static void insertionSort(int[] arr) {
        for (int k = arr.length - 2; k >= 0; k--) {
            int newElement = arr[k];
            int location = k + 1;
            while (location < arr.length && arr[location] < newElement) {
                arr[location - 1] = arr[location];
                location++;
            }
            arr[location - 1] = newElement;

        }
        System.out.println(Arrays.toString(arr));
    }
}