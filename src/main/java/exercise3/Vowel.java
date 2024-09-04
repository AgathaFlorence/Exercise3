package exercise3;
import java.io.*;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){

          Scanner inputvowelword = new Scanner (System.in);
            System.out.println("\n" + "Input the word for vowel count");
            String str1 = inputvowelword.nextLine();


            str1 = str1.toLowerCase();
            int count1= 0;

            for (int i = 0; i < str1.length(); i++) {
                // check if char[i] is vowel
                if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                        || str1.charAt(i) == 'i'
                        || str1.charAt(i) == 'o'
                        || str1.charAt(i) == 'u') {
                    // count increments if there is vowel in
                    // char[i]
                    count1++;
                }
            }

            // display total count of vowels in string
            System.out.println(
                    "Total numbers of vowels in string are: " + count1);

    }
}
