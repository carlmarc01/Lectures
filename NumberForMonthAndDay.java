package Assignments;

import java.util.Scanner;

public class NumberForMonthAndDay {
    public static void main(String[] args) {
        int number;
        Scanner m = new Scanner(System.in);
        number = m.nextInt();
        m.close();

        String to = "31 of days.";
        String ty = "30 of days.";
        String te = "28 of days and will be 29 of days for every 4 years.";
        String mo = "This is the month of";
        

        switch (number){
            case 1:
            System.out.println(mo + " January and has a " + to );
            break;

            case 2:
            System.out.println(mo + " February and has a " + te );
            break;

            case 3:
            System.out.println(mo + " March and has a " + to );
            break;

            case 4:
            System.out.println(mo + " April and has a " + ty );
            break;

            case 5:
            System.out.println(mo + " May and has a " + to );
            break;

            case 6:
            System.out.println(mo + " June and has a " + ty );
            break;

            case 7:
            System.out.println(mo + " July and has a " + to );
            break;

            case 8:
            System.out.println(mo + " August and has a " + to );
            break;

            case 9:
            System.out.println(mo + " September and has a " + ty );
            break;
            
            case 10:
            System.out.println(mo + " October and has a " + to );
            break;

            case 11:
            System.out.println(mo + " November and has a " + ty );
            break;

            case 12:
            System.out.println(mo + " December and has a " + to );
            break;

            default:
            System.out.println("Please enter between 1-12 that stands for the Month");


        }
    }
}

