package src.main.Youtube;
import java.util.Scanner;

public class Switch {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day = sc.nextInt();
        sc.close();
        switch(day){
            case 1:
            System.out.println("Its Monday");
            break;
            case 2:
            System.out.println("Its Tuesday");
            break;
            case 3:
            System.out.println("Its Wednesday");
            break;
            case 4:
            System.out.println("Its Thursday");
            case 5:
            System.out.println("Thank God its Friday!" + " :)");
            break;
            default :
            System.out.println("Weekend!!!");
            break;

        }
        
    }
}
