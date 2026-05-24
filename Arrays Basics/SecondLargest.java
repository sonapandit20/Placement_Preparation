
import java.util.Scanner;

public class SecondLargest {
    public static void main (String [] args) {
         int numbers[] = new int [5];
         System.out.println("Enter the elements of the array: ");
         Scanner sc = new Scanner (System.in);
            for ( int i = 0; i < numbers.length; i++){
                System.out.println("Enter the element for " + i + "th" + " index" + ": ");
                numbers [i] = sc.nextInt();
            }
            int secondLargest = SecondLargest(numbers);
            System.out.println("The second largest element in the array is: " + secondLargest);

    }

    public static int Largest ( int numbers[]) {
        int largest = numbers[0];
        for ( int i =1; i<numbers.length; i++){
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static int SecondLargest ( int numbers[]) {
        int largest = Largest(numbers);
        int secondlargest = Integer.MIN_VALUE;
        for ( int i = 1; i<numbers.length; i++) {
            if ( numbers[i] != largest && numbers[i] > secondlargest) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
    }
}