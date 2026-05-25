import java.util.Scanner;
public class ArrayReverse {
    public static void main (String [] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the elements of the array: ");
        for( int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of " +  i + "th" + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array:");
        for ( int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }
        System.out.println();
        ArrayReverse(arr);
        System.out.print("Reversed Array: ");
        for ( int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }

    public static void ArrayReverse ( int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while ( start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
