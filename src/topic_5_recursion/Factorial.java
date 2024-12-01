/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package topic_5_recursion;
import java.util.Scanner;

public class Factorial {
    
    public int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
    
    public static void main (String args []){
        
                 Scanner scanner = new Scanner(System.in);
		 Factorial calculator = new Factorial();
	        
	     System.out.print("Enter a number to calculate its factorial: ");
	     int number = scanner.nextInt(); 
	        
	     int result = calculator.factorial(number);
	        
	     System.out.println("Factorial of " + number + " is: " + result);
	        
	     scanner.close(); 
        
    }
}