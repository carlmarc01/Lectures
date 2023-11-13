package Assignments;

import java.util.Scanner;

public class NumberToDayOfTheWeek {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number between 1-7 only: ");
        int number = input.nextInt();

        String corres = "You have entered a number that corresponds to";


        switch(number){
            case 1:
                System.out.println(corres + " Monday.");
                break;
            case 2:
                System.out.println(corres + " Tuesday.");
                break;
            case 3:
                System.out.println(corres + " Wednesday.");
                break;
            case 4:
                System.out.println(corres + " Thursday.");
                break;
            case 5:
                System.out.println(corres + " Friday.");
                break;
            case 6:
                System.out.println(corres + " Saturday.");
                break;
            case 7:
                System.out.println(corres + " Sunday.");
                break;
            default:
                System.out.println("Please enter the number between 1-7 only");
        }
    }
}
