package Arrays;

import java.util.Scanner;

public class SecondArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of Array");
        size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter Car names or vehicles");
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextLine();
            }
            for(int i=0; i<=arr.length;i++) {
                System.out.println(arr[i]);
            }
            sc.close();
        }
        catch(Exception e){
        e.printStackTrace();
    }}

}
