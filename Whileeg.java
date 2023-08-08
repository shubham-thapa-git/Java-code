import java.util.Scanner;

public class Whileeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        int i=0;
        while(i<n){
            System.out.println("hoohaa this is a while loop");
            i++;
        }

    }
}
