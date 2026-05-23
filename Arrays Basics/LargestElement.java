
import java.util.Scanner;

public class LargestElement{
    public static void main(String [] args) {
     int numbers[] = new int [5];
     System.out.println("Enter the Elements of Array: ");
     Scanner sc = new Scanner (System.in);
     for ( int i=0; i<numbers.length;i++) {
        System.out.print("Enter the element for " + i + "th" + " index" + ": ");
         numbers [i] = sc.nextInt();
     }
       int largest = LargeElement(numbers);
       System.out.println("The largest element in the array is: " + largest);   
    }

     public static int LargeElement( int numbers[]) {
        int largest = numbers[0];
        for ( int i = 1 ; i < numbers.length ; i++) {
            if ( numbers [i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;

     }
}