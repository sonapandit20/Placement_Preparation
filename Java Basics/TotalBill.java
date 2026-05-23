import java.util.*;
public class TotalBill {
    public static void main ( String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the cost of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of Eraser: ");
        float eraser = sc.nextFloat();
        float TotalBill = pencil + pen + eraser;
        System.out.print(" Total Bill of your grocrssry is:" + TotalBill ); 
    }
}