package Assignments;

import java.util.Scanner;

public class ScoreGradeFtoA {
    public static void main(String[] args) {
        int grade;
        Scanner g = new Scanner(System.in);
        grade = g.nextInt();

        if(grade >= 90 && grade <= 100){
            System.out.println("You are a genius! Your grade is A!");
        }
        else if(grade >=80 && grade < 90 ){
            System.out.println("You are great! Your grade is B!");
        }
        else if( grade >= 70 && grade <= 79){
            System.out.println("You made it! Your grade is C!");
        }        
        else if( grade >= 60 && grade <= 69){
            System.out.println("You will get better! Your grade is D!");
        }
        else if( grade < 59 && grade > 0){
            System.out.println("Your grade is F! Let's try again!");
        }
        else{
            System.out.println("Please a valid score from 1-100 only");
        }

    }
}