package src.main.Youtube;
import java.util.Scanner;   
public class Votingage {
    public static int voteValid(int a)
{
    int x;
    if(a<=0){
    x=1;
return x;  
}
   else if(a>+18){
x=2;
return x;
}
else{
x=3;
return x;
}
}
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        a= sc.nextInt();
       int x= voteValid(a);
        if (x==1){
        System.out.println("Enter a valid age");  
        }
        else if(x==2)
            {System.out.println("Eligible to vote");
    }
    else if(x==3)
    {
    System.out.println("Not eligible to vote");
    }
        sc.close();
    }
}

