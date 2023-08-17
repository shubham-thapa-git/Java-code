package src.main.Youtube;
import java.io.IOException;
import java.util.Scanner;

public class Average{
    

    /*function to calculate average of three numbers */
    public static int avgCalc(int a, int b, int c)
    {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("enter the second number");
        b= sc.nextInt();
        System.out.println("enter the third number");
        c= sc.nextInt();
        int avg = avgCalc(a,b,c);

        System.out.println("The average of your inputs is:"+ avg);
sc.close();
    }
}