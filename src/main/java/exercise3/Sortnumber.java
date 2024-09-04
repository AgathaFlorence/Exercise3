package exercise3;
import java.util.Scanner;

public class Sortnumber {
    public static void sortnumberArray(){//Initialize array

        int [] arr2 = new int[] {5,6,8,11,1};


        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i] > arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i] + " ");
        }

    }
}
