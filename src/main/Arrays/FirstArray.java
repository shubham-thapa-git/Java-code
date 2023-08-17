package src.main.Arrays;
/*This program has some problems needs to be fixed */

import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {
        int arrayTest[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int n = input.nextInt();
        System.out.println("Okay, now input a number and press Enter.");
        if(n>10){
            System.out.println("Invalid size! Array can only support 10 numbers");
            input.close();
            return;
        }
        else{
            for(int i=0;i<n;i++){
            arrayTest[i] = input.nextInt();
        }
        for(int i=0;i<=arrayTest.length;i++)
        {
            System.out.println("Element of arrays are "+ arrayTest[i]);
        }
        
    }
    input.close();

    }
    }
    

