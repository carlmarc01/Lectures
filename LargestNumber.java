package Assignments;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int num1 = input.nextInt();

        System.out.println("Please enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("Please enter your third number: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) // Num1 is the biggest
            System.out.println("The biggest number among "+ num1 + ", " + num2 + " and " + num3 + " is " + num1);

        else if(num2 > num1 && num2 > num3) // Num2 is the biggest
            System.out.println("The biggest number among "+ num1 + ", " + num2 + " and " + num3 + " is " + num2);
        
        else if(num3 > num1 && num3 > num2) // Num3 is the biggest
            System.out.println("The biggest number among "+ num1 + ", " + num2 + " and " + num3 + " is " + num3 + ".");

        else if (num2 == num1 && num1 > num3) // Num1=Num2 > Num3
            System.out.println("The biggest number among "+ num1 + ", " + num2 + " and " + num3 + " is " + num1);

        else if (num3 == num1 && num3 > num2) // Num1=num3 > num2
            System.out.println("The biggest number among "+ num1 + ", " + num2 + " and " + num3 + " is " + num3);

        // else if(num3 == num1 && num1 == num2 && num2 == num3)
        else if (num1 == num2 && num2 == num3)
            System.out.println("All of the numbers that you have provided are equal; "  + num1);

        else{
            System.out.println("Please put a different set of numbers.");
        }
    }
    
}
