
import java.util.Scanner;
public class LinearSearch {
    public static void main ( String [] args) {
        int arr[] = new int [5];
        Scanner sc = new Scanner (System.in);
        for ( int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of " + i + "th" + " index: ");
        arr[i] = sc.nextInt();
     }
     System.out.print("Enter the number which you want to search:");
     int key = sc.nextInt();
     int index = LinearSearch( arr , key);
     if ( index == -1) {
        System.out.println("Element not found in the array");
     }
     else {
        System.out.println("Element found at index: " + index);
     }  
    }

     public static int LinearSearch ( int arr[] ,  int key) {
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == key) {
                return i;
            }
     }        
     return -1;
}
}
