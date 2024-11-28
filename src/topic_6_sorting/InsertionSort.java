/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic_6_sorting;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
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
        insertionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);
        
        double timeElapsed = (endTime - startTime) / 1000000.0;
        System.out.printf("Sorting time: %.2f milliseconds%n", timeElapsed);
        
        scanner.close();
    }
}