package Assignments;

import java.util.Scanner;

public class CheckVowelsConsonants {

    void findVowelOrNot(char x){

        if ( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println(x + " is a Vowel.");
        }
        else if ((x>='a'&& x<='z')||(x>='A'&& x<='Z')){
            System.out.println(x + " is a Consonant.");
        }
        else {
            System.out.println("It is not an alphabet");
        }
    }
    public static void main(String[] args){
        
        CheckVowelsConsonants c=new CheckVowelsConsonants();
        Scanner input = new Scanner(System.in);
        System.out.print("Please input any one of the characters from A-Z: ");
        char x = input.next().charAt(0);
        c.findVowelOrNot(x);
    }
}
