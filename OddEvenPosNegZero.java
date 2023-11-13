package Assignments;

import java.util.Scanner;

public class OddEvenPosNegZero {

    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter any number here:");
        int num = input.nextInt();
        
        // checking if a number is positive, negative or zero.
        if (num > 0 )
            System.out.println("The number that you have set is Positive.");
        else if ( num == 0 )
            System.out.println("You have entered a Zero.");
        else 
            System.out.println("The number that you have set is Negative.");
        

        // checking for odd or even
        if ( num % 2 == 0){
            System.out.println(num + " is an Even number.");
        }
        else {
            System.out.println(num + " is an Odd number.");
        }
    }
}

