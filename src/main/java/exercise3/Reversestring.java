package exercise3;

import java.util.Scanner;
import java.io.*;

public class Reversestring {
    public static void main(String[] args){
        Scanner revword = new Scanner(System.in);
        System.out.print("\n" + "Enter the word to be reversed: ");
        String str = revword.nextLine(), nstr="";
        char ch;

        System.out.println("Original word: " + str);


        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);

    }
}
