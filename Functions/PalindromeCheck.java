
import java.util.Scanner;

public class PalindromeCheck {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the integer: ");
        int num = sc.nextInt();
        if (isPalidrome(num)) {
            System.out.println("number is palidrone");
        } else {
            System.out.println("number is not palidrone");
        }
    }



    public static boolean isPalidrome ( int num ) {
           int originalNum = num;
           int rev = 0;
           while( num != 0) {
             int lastdigit = num % 10; // gives the remainder
            rev = rev *10 + lastdigit; //gives the reverse of the number
            num = num / 10; // gives the quotient
           }
           return originalNum == rev;
    }
}
