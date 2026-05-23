import java.util.Scanner;

public class EvenOddSum {
    public static void main (String [] args) {
        int evensum = 0;
        int oddsum = 0;
        Scanner sc = new Scanner ( System.in);
        System.out.print("Enter that how much number you want to take as input:");
        int n = sc.nextInt();
        
        for ( int i = 1; i <= n; i++) {
            System.out.print("Enter the number" + i + " :");
            int num = sc.nextInt();
            if ( num %2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);

    }
}