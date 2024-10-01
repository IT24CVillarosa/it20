
package devlinked;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
            Scanner kho = new Scanner(System.in);
		
	    Linkedlist list = new Linkedlist();

        // Adding elements to the list
         System.out.println("Enter the list of the elements:");
         int item1 = kho.nextInt();
         int item2 = kho.nextInt();
         int item3 = kho.nextInt();
         int item4 = kho.nextInt();
         int item5 = kho.nextInt();
         
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        
        
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println("Enter the Number you want to delete: ");
        System.out.println();
        System.out.println("Deleting 2 from the list...");
        System.out.println("Current Linked List:");
        int item6 = kho.nextInt();
        list.deleteByValue(20);
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        System.out.println("Enter the number you want to swap/move: ");
        list.moveNodePointer(0,2);
        list.printList();
	}
}
