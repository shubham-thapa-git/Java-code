import java.util.Scanner;
public class sumOfOdd{

    public static int oddSum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
if(i%2!=0){
    s=s+i;
}
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n"); 
        int n = sc.nextInt();
        int su = oddSum(n);
        System.out.print("Sum of Odd numbers upto"+' '+n+' ');
        System.out.println("is"+' '+su);
        sc.close();
    }
}
