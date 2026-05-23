
import java.util.Scanner;

public class EvenCheck {
    public static void main (String [] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is not even");
        }
    
    }


    public static boolean isEven ( int num) {
        return ( num % 2 == 0); // return true if even return false if not even 
        // basically we can write this code as this for easy understanding
        /* if ( num % 2 == 0) {
             retunr true;
        } else {
            return false;
            }
         */
    }
}
