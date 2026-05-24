import java.util.Scanner;

public class SecondLargestOptimized {
    public static void main (String [] args) {
        int numbers[] = new int[5];
        System.out.println("Enterr the elements of the Array: ");
        Scanner sc = new Scanner(System.in);
        for ( int i =0; i <numbers.length; i++) {
            System.out.print("Enter the element of the array for " +  i + "th" + " index : ");
            numbers[i] = sc.nextInt();
        }
        int secondLargest = SecondLargest(numbers);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static int SecondLargest ( int numbers[]) {
        int largest = numbers[0];
        int secondlargest = Integer.MIN_VALUE;
        for ( int i =1; i <numbers.length; i++) {
            if ( numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondlargest && numbers[i] != largest) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
    }
}
