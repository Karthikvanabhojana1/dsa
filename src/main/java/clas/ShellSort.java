package clas;

import java.util.Random;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[30];
        Random random = new Random();

        // Fill the array with random integers between 0 and 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101); // Random integers from 0 to 100
        }

        // Print the original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array using shellSort
        shellSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    }

