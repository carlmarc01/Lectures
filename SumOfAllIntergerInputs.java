package Assignments;

import java.util.Scanner;

public class SumOfAllIntergerInputs {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number:");
            int number;
            int sum = 0;
    
            do{
                number = input.nextInt();
                sum+=number;
                System.out.println("The current sum is " + sum);
            } while (number !=0 );
        }
    }
