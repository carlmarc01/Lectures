package Assignments;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put your input");
        String str = scan.nextLine();
        String reverseStr ="";
        scan.close();

        int strLength = str.length();

          for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
          }

          if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
          }
          else {
            System.out.println(str + " is not a Palindrome String.");
          }
        }
}
