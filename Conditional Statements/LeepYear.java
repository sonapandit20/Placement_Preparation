
import java.util.Scanner;

public class LeepYear {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the year,Which you want to check: ");
        int year = sc.nextInt();

        if ( year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("Year is a leep year:");  
        } else {
            System.out.println(" Year is not a leep year:");
        }
    }
}