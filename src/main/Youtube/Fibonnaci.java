
package src.main.Youtube;
import java.util.Scanner;

public class Fibonnaci
{

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the FIbonacci series");
        n= sc.nextInt();
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}