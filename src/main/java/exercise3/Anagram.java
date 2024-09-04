package exercise3;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void checkAnagram() {
        // create an object of Scanner class
        Scanner input4 = new Scanner(System.in);

        // take input from users
        System.out.print("Enter first String: ");
        String str4 = input4.nextLine();
        System.out.print("Enter second String: ");
        String str5 = input4.nextLine();

        // check if length is same
        if (str4.length() == str5.length()) {
            // convert strings to char array
            char[] charArray1 = str4.toCharArray();
            char[] charArray2 = str5.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str4 + " and " + str5 + " are anagram.");
            } else {
                System.out.println(str4 + " and " + str5 + " are not anagram.");
            }
        } else {
            System.out.println(str4 + " and " + str5 + " are not anagram.");
        }

        input4.close();



    }
}
