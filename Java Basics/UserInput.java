import java.util.*;
public class UserInput {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out .print(" Enter first number :");
        int a =  sc.nextInt();
        System.out.print(" Enter seccond number :");
        int b =  sc.nextInt ();
        System.out.print(" Enter third number :");
        int c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.print(" Avg of the numbers are : " + avg);
    }}