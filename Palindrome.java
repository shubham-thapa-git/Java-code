import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a string or an integer: ");
      String inputString = input.nextLine();

      // Convert the input to a string in case it's an integer
      String str = String.valueOf(inputString);

      boolean isPalindrome = true;
      int length = str.length();
      for (int i = 0; i < length / 2; i++) {
          if (str.charAt(i) != str.charAt(length - i - 1)) {
              isPalindrome = false;
              break;
          }
      }

      if (isPalindrome) {
          System.out.println("The input is a Palindrome.");
          System.out.println("Result: 1");
      } else {
          System.out.println("The input is not a Palindrome.");
          System.out.println("Result: 0");
      }

      input.close();
  }
    }
     

