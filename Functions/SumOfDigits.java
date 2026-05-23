
import java.util.Scanner;

public class SumOfDigits {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        System .out.print("Enter the integer: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of the given integer is : " + SumOfDigits (num));
    }



    public static int SumOfDigits ( int num) {
        int sum = 0;
        while ( num != 0) {
            int lastdigit = num %10;
            sum = sum + lastdigit;
            num = num / 10;
        }

        return sum;
    }
}
