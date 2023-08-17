package src.main.Youtube;
import java.util.Scanner;

public class Multiplication {
    public static double multi(double a, double b){
        double mul=(a*b);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double a= sc.nextDouble();
        System.out.println("Enter the second number");
        double b= sc.nextDouble();

        double m= multi(a,b);
        System.out.println("the multiple of the numbers are:"+ m);
        sc.close();
    }
}
