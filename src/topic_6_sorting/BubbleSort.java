/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic_6_sorting;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        bubbleSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);
        
        double timeElapsed = (endTime - startTime) / 1000000.0;
        System.out.printf("Sorting time: %.2f milliseconds%n", timeElapsed);
        
        scanner.close();
    }
}