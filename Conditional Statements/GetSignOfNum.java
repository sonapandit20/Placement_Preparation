
import java.util.*;

public class GetSignOfNum {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Enter a number: ");
        int num = sc.nextInt();
        if ( num > 0) {
            System.out.println("Your number is Positive:");
        } else {
            System.out.println(" Your number is Negative:");
        }
    }
}