package src.main.Youtube;

import java.util.Scanner;


public class FindRemainder {


    public int Remainder(int a, int b)
{
    int rem = a%b;
    return rem;
}
    public double Remainder(double a, double b)
{
    double rem = a%b;
    return rem;
}
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.println("enter the dividend"); 
           int dividend = sc.nextInt();
            System.out.println("enter the divisor"); 
            int divisor = sc.nextInt();
           FindRemainder fd= new FindRemainder();

           int rem = fd.Remainder(dividend,divisor);
           System.out.println("The remainder when " + dividend + " is divided by " + divisor + " is = "+rem);
           sc.close();
   
}
}
