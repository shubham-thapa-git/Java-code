import java.io.IOException;
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) throws IOException {
        int n;
System.out.println("Enter the value of n");
Scanner sc = new Scanner(System.in); {
    n= sc.nextInt();
}
System.out.println("you have entered:"+n);
sc.close();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
    System.out.print("*");
}
System.out.println();

    }
}
}


