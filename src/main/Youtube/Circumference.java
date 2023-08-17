package src.main.Youtube;
import java.util.Scanner;
public class Circumference {
    public static double circumference(double a)
    {
        double cir= 2*3.142*a;
        return cir;
    }
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius to calculate the circumference");
        a = sc.nextDouble();
         double cc= circumference(a);
         System.out.println("The circumference is"+ ' '+cc);
        sc.close();
    }
}
