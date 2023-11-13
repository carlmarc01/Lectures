package Assignments;

import java.util.Scanner;

public class CountNumberOfWords {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a series of words:");
        String words;
        words = input.nextLine();

        int CountWords = words.split("\\s").length;
        System.out.println(CountWords);
    }

}
