package src.main.Youtube;
import java.util.Scanner;

public class Greater {

    public static int compare(int a , int b)
    {
        int c;
        if(a>b){
            c=a;
        }
        else
        c=b;
        return c;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        int g=compare(a,b);
        System.out.println("The greater number is "+g);
        sc.close();
    }
}
