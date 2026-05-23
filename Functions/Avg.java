
import java.util.Scanner;

public class Avg {
    public static void main (String [] args) {
         System.out.println("Welcome to Avg calculator:");
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your first number: ");
         int a = sc.nextInt();
         System.out.print("Enter your second number: ");
         int b = sc.nextInt();
         System.out.print("Enter your 3rd number: ");
         int c = sc.nextInt();
         System.out.println("Avg of given numbers is: " + Avgof3Num(a,b,c));
    }

    public static int Avgof3Num( int a , int b , int c) {
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }
}


