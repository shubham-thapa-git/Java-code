package src.main.Youtube;

import java.util.Scanner;

public class Reverse {
    

    public static void main(String[] args) {
        
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be reversed");
        s=sc.nextLine();
        System.out.println("You have entered "+s);
        int len=s.length();
        System.out.println("length of the Stirng is"+len);
        sc.close();

    }
}
