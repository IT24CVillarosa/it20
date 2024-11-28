/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic_6_sorting;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal array:");
        printArray(arr);

        long startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);
        
        double timeElapsed = (endTime - startTime) / 1000000.0;
        System.out.printf("Sorting time: %.2f milliseconds%n", timeElapsed);
        
        scanner.close();
    }
}