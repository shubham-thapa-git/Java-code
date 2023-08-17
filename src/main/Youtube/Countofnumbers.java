package src.main.Youtube;
import java.util.Scanner;
public class Countofnumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many numbers do you want to enter?");
       int n = sc.nextInt();
       int[] numbers = new int[n];
       System.out.println("Enter your numbers one by one and press enter after each number");
       for(int i=0;i<n;i++)
       {
        numbers[i] = sc.nextInt();
       }

        sc.close();
    }
}
