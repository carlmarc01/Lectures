package Assignments;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any word: ");
        String x;
        x = input.nextLine();

        System.out.println("The number of characters in word (" + x + ") is " + x.length());
        System.out.println("This is the capitalized version of your word (" + x + "): " +x.toUpperCase());
        System.out.println("This is the uncapitalized version of your word (" + x + "): " +x.toLowerCase());
        System.out.println("This is the first letter of your word (" + x + "): " +x.charAt(0));
        System.out.println("This is the last letter of your word (" + x + "): " +x.charAt(x.length()-1));
        System.out.println( "This is the letters from the second up to the fifth of your word (" + x + "): " +x.substring(1, 5));
    
    }
}
